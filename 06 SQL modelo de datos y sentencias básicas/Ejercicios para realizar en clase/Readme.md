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
select player_name, cuenta_partidos, max_partidos.sum_partidos 
from player p,  (	select player_id, count (*) as cuenta_partidos, sum(pts) as sum_partidos
		from player_game_log
		group by player_id
		/*order by count(*) desc limit 1*/) max_partidos
where p.player_id = max_partidos.player_id 
order by cuenta_partidos desc
```
- Obtener el jugador con más triples dobles y que equipos distintos le han sufrido (campo td3).
```sql
select p2.player_name, t1.nickname as casa ,t2.nickname as fuera, case WHEN pgl2.team_id = t1.team_id 
																  then t2.nickname  
														          else t1.nickname  end as equipo_sufridor
from player_game_log pgl2, game g, team t1, team t2, player p2 
where g.game_id = pgl2.game_id and pgl2.td3=1 and 
	g.team_id_home = t1.team_id and g.team_id_away = t2.team_id and
	p2.player_id = pgl2.player_id and
	pgl2.player_id = (
	select p.player_id 
	from player_game_log pgl, player p
	where pgl.player_id = p.player_id 
	group by p.player_id 
	having sum(td3) = (select max(td3) from (
					select player_id, sum(td3) as td3
					from player_game_log pgl
					group by player_id) as player_td3))
					
--SACANDO EL QUE MÁS LE HA SUFRIDO
select COUNT(*), case WHEN pgl2.team_id = t1.team_id 
																  then t2.nickname  
														          else t1.nickname  end as equipo_sufridor
from player_game_log pgl2, game g, team t1, team t2, player p2 
where g.game_id = pgl2.game_id and pgl2.td3=1 and 
	g.team_id_home = t1.team_id and g.team_id_away = t2.team_id and
	p2.player_id = pgl2.player_id and
	pgl2.player_id = (
	select p.player_id 
	from player_game_log pgl, player p
	where pgl.player_id = p.player_id 
	group by p.player_id 
	having sum(td3) = (select max(td3) from (
					select player_id, sum(td3) as td3
					from player_game_log pgl
					group by player_id) as player_td3))
group by equipo_sufridor					


-- MISMA QUERY CON JOINS
select p2.player_name, t1.nickname as casa ,t2.nickname as fuera, case WHEN pgl2.team_id = t1.team_id 
																  then t2.nickname  
														          else t1.nickname  end as equipo_sufridor
from player_game_log pgl2 
inner join game g on (g.game_id = pgl2.game_id)
join team t1 on (g.team_id_home = t1.team_id)
join team t2 on (g.team_id_away = t2.team_id)
join player p2 on (p2.player_id = pgl2.player_id)
where pgl2.td3=1  and 
	pgl2.player_id = (
	select p.player_id 
	from player_game_log pgl, player p
	where pgl.player_id = p.player_id 
	group by p.player_id 
	having sum(td3) = (select max(td3) from (
					select player_id, sum(td3) as td3
					from player_game_log pgl
					group by player_id) as player_td3))
					
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


```

- Obtener un listado de los jugadores que más puntos metieron en su año de DRAFT y el número de partidos que jugaron.

