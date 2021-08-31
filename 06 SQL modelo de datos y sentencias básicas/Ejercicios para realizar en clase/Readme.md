Es necesario haber revisado el apartado I de instalación de Postgre. Una vez realizado esto es necesario antes de empezar las clases de postgre, los siguientes pasos:
- Echar un vistazo a este repo de Git: https://github.com/mpope9/nba-sql
- De aquí, extraeremos el último dump de las estadísticas de la NBA: https://github.com/mpope9/nba-sql/releases
- Una vez descargada y descomprimida, será necesario instalarla en nuestro postgre. Para ello será necesario ejecutar los siguientes comandos:
```
xz -d nba.sql.xz # Descomprime el dump de base de datos de la nba
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
- Obtener el jugador con mayor número de puntos en un partido
- Obtener el jugador con más triples dobles y que equipos distintos le han sufrido.
- Sacar los paises que no sean EEUU que más han contribuido con jugadores ordenado de forma descendente.
- Obtener el jugador que más puntos metió en su año de DRAFT
- Obtener el nombre y temporada de los jugadores que en una temporada han metido más del 30% del todos los puntos de su equipo.
