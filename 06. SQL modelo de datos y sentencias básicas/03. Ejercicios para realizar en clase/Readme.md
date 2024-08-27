Es necesario haber revisado el apartado I de instalación de Postgre. Una vez realizado esto es necesario antes de empezar las clases de postgre, los siguientes pasos:
- Echar un vistazo a este repo de Git: https://github.com/mpope9/nba-sql
- De aquí, se ha realizado un dump de 1997 al 2024. El resultado está en:
```
python3 -m venv venv
source venv/bin/activate
pip install -r requirements.txt
python ./nba_sql.py --database postgres --database_name nba --time-between-requests 0.5 --database_host localhost --username postgres --default-mode --seasons {1997-98,1998-99,1999-00,2000-01,2001-02,2002-03,2003-04,2004-05,2005-06,2006-07,2007-08,2008-09,2009-10,2010-11,2011-12,2012-13,2013-14,2014-15,2015-16,2016-17,2017-18,2018-19,2019-20,2020-21,2021-22,2022-23,2023-24}   --password admin123 --skip-tables play_by_play shot_chart_detail --database="postgres"
```
- Resultado del backup:
https://github.com/AgustinICAI/CursoCeroMBD/raw/master/06.%20SQL%20modelo%20de%20datos%20y%20sentencias%20b%C3%A1sicas/nba



- Una vez descargada y descomprimida, será necesario cargar este dump en nuestro postgre. Para ello seguid los mismos pasos que hicimos para cargar la base de datos del videoclub.
- Será necesario crear una base de datos llamada 'nba' y cargar el backup descargado del enlace superior.

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


- Sacar los paises que no sean EEUU que más han contribuido con jugadores ordenado de forma descendente.


- Obtener el jugador con mayor número de puntos en un partido

- Obtener el jugador con más partidos, sacando nombre jugador y puntos.

- Obtener el jugador con más triples dobles y que equipos distintos le han sufrido (campo td3).


- Obtener el nombre y temporada de los jugadores que en una temporada han metido más del 30% del todos los puntos de su equipo.


- Obtener un listado de los jugadores que más puntos metieron en su año de DRAFT y el número de partidos que jugaron.

