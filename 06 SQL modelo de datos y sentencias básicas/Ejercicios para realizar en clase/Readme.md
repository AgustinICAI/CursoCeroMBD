Es necesario haber revisado el apartado I de instalación de Postgre. Una vez realizado esto es necesario antes de empezar las clases de postgre, los siguientes pasos:
- Echar un vistazo a este repo de Git: https://github.com/mpope9/nba-sql
- De aquí, extraeremos el último dump de las estadísticas de la NBA: https://github.com/mpope9/nba-sql/releases
- Una vez descargada y descomprimida, será necesario instalarla en nuestro postgre. Para ello será necesario ejecutar los siguientes comandos:
```
xz -d nba.sql.xz # Descomprime el dump de base de datos de la nba
sudo su postgres # Comando para ponernos con el usuario postgres en la máquina
psql # conectar a la base de datos
> CREATE DATABASE nba;
psql -U <USERNAME> <DBNAME> < nba.sql # Carga la base de datos. En <USERNAME>, usaremos el usuario de postgresql por defecto que es "postgres" y en <DBNAME> nba 
```
- Echar un vistazo en pgAdmin que todo se encuentre correctamente cargado
- Para trabajar y realizar los ejercicios utilizaremos otro IDE de gestion de base de datos. El elegido es dbeaver. Usaremos snap para instalarlo: 
```
sudo snap install dbeaver-ce
```

Para abrir nuestra base de datos importada, tendremos que realizar los siguientes pasos:
1. New Database connection
2. Indicar que se trata de una base de datos postgresql
3. Los datos a rellenar son:
- Host: localhost
- Port: 5432
- Database: postgres
- Username: postgres
- Password: la que se haya definido. Si seguimos los pasos del punto I, se puede usar "admin123"


## Ejercicios

- Hacer una select sobre las tablas de la base de datos para poder observar los campos y contenidos que tienen las tablas
- Sacar toda la información sobre Kobe Bryant
- Sacando el id_player, sacar todas las estadisticas de los partidos de Kobe Bryant
- Sacar los paises que no sean EEUU que más han contribuido con jugadores ordenado de forma descendente.
- Obtener el jugador con mayor número de puntos en un partido
- Obtener el jugador con más partidos, sacando nombre jugador y puntos.
- Obtener el jugador con más triples dobles y que equipos distintos le han sufrido (campo td3).
- Obtener el nombre y temporada de los jugadores que en una temporada han metido más del 30% del todos los puntos de su equipo.
- Obtener un listado de los jugadores que más puntos metieron en su año de DRAFT y el número de partidos que jugaron.



# Soluciones
- Obtener el jugador con más partidos, sacando nombre jugador y puntos.
```sql
select p.player_name, count(*) from player_game_log pgl, player p 
where p.player_id = pgl .player_id 
group by p.player_name 
having count(*) = (select max(partidos) from 
                                     (select pgl2.player_id, count(*) partidos 
                                      from player_game_log pgl2
                                      group by pgl2.player_id) countpartidos)

```

- Obtener el jugador con más triples dobles y que equipos distintos le han sufrido (campo td3).
```sql
select *
from player_game_log pgl3
where td3 = 1 and pgl3.player_id = (
								select pgl.player_id 
								from player_game_log pgl
								group by pgl.player_id 
								having sum(td3) = (select max(sumatd3) from (select pgl2.player_id, sum(td3) sumatd3 from player_game_log pgl2
                                group by pgl2.player_id 
																			order by 2 desc) maxtd3))
			
```
```sql
select equiposufridor, count(*)
from (select CASE WHEN t1.team_id = pgl.team_id THEN t2.nickname
            ELSE t1.nickname
       end as equiposufridor
from player_game_log pgl, player p, game g, team t1, team t2
where t1.team_id = g.team_id_home_id and t2.team_id = g.team_id_away_id 
      and g.game_id = pgl.game_id and p.player_id = pgl.player_id 
      and td3=1 and pgl.player_id  = (
	select pgl1.player_id
	from player_game_log pgl1 
	group by pgl1.player_id
	having sum(td3) = (select max(playerTD3.td3)
					   from (select pgl2.player_id,sum(td3) as td3
					         from player_game_log pgl2
					         group by pgl2.player_id) playerTD3 ))) tablaEquipos 
group by tablaEquipos.equiposufridor
```

- Obtener el nombre y temporada de los jugadores que en una temporada han metido más del 30% del todos los puntos de su equipo.

```sql
select p.player_name, pgl.team_id, pgl.season_id, sum(pts)
from player p, player_game_log pgl 
where pgl.player_id  = p.player_id 
group by p.player_name, pgl.team_id, pgl.season_id
having sum(pts) > 0.3 * (select sum(pts)
						 from player_game_log pgl2
						 where pgl2.season_id = pgl.season_id and pgl2.team_id = pgl.team_id 
						 group by pgl2.season_id, pgl2.team_id)

```

```sql
select *
from 
(select p.player_name player_name, pgl.team_id team_id, pgl.season_id season_id, sum(pts) pts_jugador
from player p, player_game_log pgl 
where pgl.player_id  = p.player_id 
group by p.player_name, pgl.team_id, pgl.season_id) as puntos_jugador,						 
(select pgl.season_id season_id , pgl.team_id team_id , sum(pts) pts_equipo
from player_game_log pgl
group by pgl.season_id, pgl.team_id) as puntos_equipo
where puntos_jugador.team_id = puntos_equipo.team_id and puntos_jugador.season_id = puntos_equipo.season_id and pts_jugador > 0.3*pts_equipo
```

```sql
select p.player_name, sum(pts), count(*)
from player_game_log pgl
join player p on (pgl.player_id = p.player_id)
where p.draft_year = pgl.season_id::text 
group by p.player_name 
order by 2 desc

select p.player_name, sum(pts), count(*) 
from player_game_log pgl2
join player p on (pgl2.player_id = p.player_id)
join 
(select player_id as player_id, min(season_id) as primer_ano
from player_game_log pgl 
group by player_id) primera_temporada on pgl2.player_id = primera_temporada.player_id
where primera_temporada.primer_ano = pgl2.season_id 
group by player_name 
order by 2 desc

```