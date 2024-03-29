Es necesario haber revisado el apartado I de instalación de Postgre. Una vez realizado esto es necesario antes de empezar las clases de postgre, los siguientes pasos:
- Echar un vistazo a este repo de Git: https://github.com/mpope9/nba-sql
- De aquí, se ha realizado un dump de 1997 al 2022. El resultado está en: https://raw.githubusercontent.com/AgustinICAI/CursoCeroMBD/master/06%20SQL%20modelo%20de%20datos%20y%20sentencias%20b%C3%A1sicas/Ejercicios%20para%20realizar%20en%20clase/nba_dump.zip
- Una vez descargada y descomprimida, será necesario cargar este dump en nuestro postgre. Para ello seguid los mismos pasos que hicimos para cargar la base de datos del videoclub.

- Echar un vistazo en pgAdmin que todo se encuentre correctamente cargado
- Para trabajar y realizar los ejercic/ios utilizaremos otro IDE de gestion de base de datos. El elegido es dbeaver. Usaremos snap para instalarlo: 
```
sudo snap install dbeaver-ce
```

Para abrir nuestra base de datos importada, tendremos que realizar los siguientes pasos:
1. New Database connection/
- Username: postgres
- Password: la que se haya definido. Si seguimos los pasos del punto I, se puede usar "admin123"


## Ejercicios

- Hacer una select sobre las tablas de la base de datos para poder observar los campos y contenidos que tienen las tablas
- Sacar toda la información sobre Kobe Bryant
- Sacando el id_player, sacar todas las estadisticas de los partidos de Kobe Bryant
```sql
select count(*)
from player_game_log pgl 
where player_id = (SELECT player_id
FROM player where player_name like 'Kobe Bryant')
```

- Sacar los paises que no sean EEUU que más han contribuido con jugadores ordenado de forma descendente.
```sql
select country, count(*)
from player
group by country 
having country not like 'USA' and count(*) >= 10
order by count(*) desc
```

- Obtener el jugador con mayor número de puntos en un partido
```sql
select *
from player
where player_id  = (select player_id 
					from player_game_log 
					where pts = (select max(pts)
								 from player_game_log))
```
- Obtener el jugador con más partidos, sacando nombre jugador y puntos.
```sql
/* Ejemplo genérico */
select player_name, country, estadisticas_jugador.*
from player p , (select player_id , count(*) as num_partidos, sum(pts) as total_puntos
				 from player_game_log pgl
				 group by pgl.player_id) estadisticas_jugador
where p.player_id = estadisticas_jugador.player_id		
order by num_partidos desc

/* Ejemplo por clave principal, ya que el group by sea realizdo por la clave principal */
select player_name, country, count(*) as num_partidos, sum(pts) as total_puntos
from player_game_log pgl, player p 
where pgl.player_id = p.player_id 
group by p.player_id  
order by count(*) desc


/* Ejemplo para sacar solo la primera linea*/

select player_name, country, count(*) as num_partidos, sum(pts) as total_puntos
from player_game_log pgl, player p 
where pgl.player_id = p.player_id and p.player_id = (select pgl2.player_id
													from player_game_log pgl2
													group by pgl2.player_id
													having count(*) = (
																		select max(cuenta)
																		from (select count(*) as cuenta
																				from player_game_log pgl3
																				group by player_id) estadisticas  ))
group by p.player_id  
```
- Obtener el jugador con más triples dobles y que equipos distintos le han sufrido (campo td3).
```sql

select p.player_name , t0.nickname as equipo_del_jugador, CASE
            WHEN pgl4.team_id = g.team_id_home
               THEN t2.nickname
               ELSE t1.nickname
       END as equipo_sufridor, g."date" 
from player_game_log pgl4
join player p on (p.player_id = pgl4.player_id)
join team t0 on (t0.team_id = pgl4.team_id)
join game g on (pgl4.game_id = g.game_id)
join team t1 on (g.team_id_home  = t1.team_id)
join team t2 on (g.team_id_away  = t2.team_id)
where td3 = 1 
      and pgl4.player_id = (select player_id
						from player_game_log pgl3 
						group by player_id
						having sum(td3) = (select max(sum)
											from (select player_id, sum(td3)
													from player_game_log pgl2 
													group by player_id) jugador_td3))
order by g."date" 
					
```

- Obtener el nombre y temporada de los jugadores que en una temporada han metido más del 30% del todos los puntos de su equipo.
```sql
select player_name, team_id , season_id , sum(pts) as pts_jugador
from player_game_log pgl2, player p 
where p.player_id = pgl2.player_id 
group by p.player_id , team_id, season_id 
having sum(pts) > 0.3 * (select sum(pts) as pts_equipo
							from player_game_log pgl1
							group by team_id, season_id
							having pgl1.season_id = pgl2.season_id and pgl1.team_id = pgl2.team_id)	


select p.player_name , puntos_equipo_temporada_jugador.*, puntos_equipo_temporada.*
from 
(select pgl2.player_id as player_id, pgl2.team_id as team_id, pgl2.season_id as season_id, sum(pts) as pts
							from player_game_log pgl2
							group by team_id, season_id,pgl2.player_id) puntos_equipo_temporada_jugador,
(select pgl1.team_id as team_id , pgl1.season_id as season_id, sum(pts) as pts
							from player_game_log pgl1
							group by team_id, season_id) puntos_equipo_temporada, 
player p
where puntos_equipo_temporada_jugador.season_id = puntos_equipo_temporada.season_id and 
      puntos_equipo_temporada_jugador.team_id = puntos_equipo_temporada.team_id and 
      puntos_equipo_temporada_jugador.pts > 0.3* puntos_equipo_temporada.pts and 
      puntos_equipo_temporada_jugador.player_id = p.player_id

```

- Obtener un listado de los jugadores que más puntos metieron en su año de DRAFT y el número de partidos que jugaron.
```sql
select player_name, puntos_draft_jugador.season_id, puntos_draft_jugador.suma
from 
(
select  sum(pts) as suma, season_id, player_name 
from player_game_log pgl
join player p on (pgl.player_id = p.player_id)
where p.draft_year = pgl.season_id::text 
group by p.player_name, season_id
order by 2 desc) puntos_draft_jugador
,(
select max(suma) as suma, season_id
from (
select  sum(pts) as suma, season_id 
from player_game_log pgl
join player p on (pgl.player_id = p.player_id)
where p.draft_year = pgl.season_id::text 
group by p.player_name, season_id
order by 2 desc) puntos_draft
group by season_id) puntos_draft

where puntos_draft_jugador.season_id = puntos_draft.season_id
and puntos_draft_jugador.suma = puntos_draft.suma
```
