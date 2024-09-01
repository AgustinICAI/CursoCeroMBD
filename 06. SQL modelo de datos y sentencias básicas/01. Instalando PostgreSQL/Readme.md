Como apoyo la explicación de los distintos conceptos de SQL, vamos a instalar en nuestro ordenador local una instancia de base de datos. Esta instancia de base de datos correrá con la tecnología "PostgreSQL". 

## Instalación

[Postgre download](https://www.postgresql.org/download/)

- Será necesario para trabajar instalar Postgre y PGAdmin (Postgre Admin) que se puede descargar e instalar del anterior enlace.
- Para lanzar queries usaremos otro cliente de la comunidad que se llama DBeaver. [Dbeaver download](https://dbeaver.io/download/)

## Importar base de de datos
Una vez instalado el motor y comprobado que corre correctamente, vamos a proceder a importar una base de datos de prueba. La explicación está apoyada en los tutoriales oficiales de postgresql (https://www.postgresqltutorial.com/postgresql-sample-database/). Para impottar la base de datos será necesario realizar lo siguiente:
- Descargar la base de datos que vamos a utilizar: https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip


- Esta base de datos que vamos a importar, en clase entraremos más en detalle, pero presenta el siguiente modelo de datos:
![alt text](https://www.postgresqltutorial.com/wp-content/uploads/2018/03/dvd-rental-sample-database-diagram.png)


- Para importar esta base de datos en nuestro motor postgre, lo haremos a través del IDE. Para ello seguiremos los pasos del siguiente enlace, a partir del apartado "Load the DVD Rental database using the pgAdmin": https://www.postgresqltutorial.com/load-postgresql-sample-database/


- Una vez importada correctamente, navengando en la derecha sobre: dvdrental -> schemas -> Tables, deberíamos ser capaces de ver todas las tablas cargadas. Algo así:

*![alt text](https://raw.githubusercontent.com/AgustinICAI/CursoCeroMBD/master/images/BaseDatosCargada.png)



