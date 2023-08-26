Como apoyo la explicación de los distintos conceptos de SQL, vamos a instalar en nuestro ordenador local una instancia de base de datos. Esta instancia de base de datos correrá con la tecnología "PostgreSQL". 

Para ello será necesario instalar en nuestra máquina virtual un motor de base de datos postgresql como se indica en los siguientes pasos. Abrir el terminal (ventana negra) y ejecutar:
## Instalación
- En linux siempre es recomendable primero actualizar los repositorios de los paquetes, antes de instalar nada, así nos aseguraremos que siempre descargaremos las últimas versiones:
    ```
    $ sudo apt update
    ```
- Luego, vamos a instalar el paquete Postgres junto con un paquete -contrib que agrega algunas utilidades y funcionalidades adicionales:
    ```
    $ sudo apt install postgresql postgresql-contrib
    ```
## Comprobando instalación con el terminal
De forma predeterminada, Postgres usa un concepto llamado "roles" para manejar la autenticación y la autorización. Estos son, en cierto modo, similares a los usuarios y grupos que se usan en Unix.

Tras la instalación, Postgres está configurado por defecto para usar los usuarios de ubuntu que tengas, lo que significa que asocia los roles de Postgres con una cuenta de tu Linux. Si existe un rol dentro de Postgres, un nombre de usuario de Unix / Linux con el mismo nombre puede iniciar sesión como ese rol.

Cuando hemos lanzado el procedimiento de instalación, este creó una cuenta de usuario llamada "postgres" que está asociada con el rol predeterminado de Postgres. Hay algunas formas de utilizar esta cuenta para acceder a Postgres. Una forma es cambiar a la cuenta de postgres en su servidor escribiendo:
```
$ sudo -i -u postgres
```
Esto cambiará en tu terminial tu usuario, por el usuario "postgres"
Para poder ya acceder a nuestro postgre, podemos ejecutar el siguiente comando:
```
$ psql
```
Esto iniciará en el cliente de PostgreSQL y, desde aquí, se puede interactuar con el sistema de administración de la base de datos de inmediato.

Para salir del cliente de PostgreSQL, ejecute lo siguiente:
```
$ \q
```


Esto lo llevará de regreso al terminal (iniciado con el usuario "postgre"). Para volver al usuario habitual del sistema, ejecute el comando exit:
```
$ exit
```
 
Otra forma de conectarse con un cliente de Postgres es ejecutar el comando psql como la cuenta de postgres directamente con sudo e indicando el usuario con el que queremos conectar:
```
$ sudo -u postgres psql
```
Esto iniciará directamente en Postgres sin el terminal intermedio. Otra vez, se puede salir de la sesión interactiva de Postgres escribiendo:
```
$ \q
```

Por último vamos a probar a lanzar una query (si nos hemos salido en los pasos anteriores, habrá que volver a logarse con psql) contra las tablas que usa el propio postgresql para comprobar que una query nos devuelve resultados.
```
$ SELECT count(*), state FROM pg_stat_activity GROUP BY 2; ## Devuelve las sesiones activas o conectadas al motor de base de datos.
$ SELECT version(); ##Devuelve la versión instalada
```

Si estas queries nos han funcionado, ahora vamos a probar a cambiar la password del usuario postgresql:
```
$ ALTER USER postgres PASSWORD 'admin123';
```

## Instalando un IDE gráfico para trabajar con la base de datos

Como el objetivo de este curso no es aprender como administrar una base de datos desde el terminal, sino ser capaces de aprender SQL, vamos a instalar un IDE gráfico para trabajar contra nuestra base de datos. Para ello instalar "PgAdmin", siguiendo estos pasos: 
https://www.pgadmin.org/download/pgadmin-4-apt/


Instalaremos la versión desktop. El procedimiento que está documentado en su web es el siguiente:
```
#
# Setup the repository
#

# Install the public key for the repository (if not done previously):
curl -fsS https://www.pgadmin.org/static/packages_pgadmin_org.pub | sudo gpg --dearmor -o /usr/share/keyrings/packages-pgadmin-org.gpg

# Create the repository configuration file:
sudo sh -c 'echo "deb [signed-by=/usr/share/keyrings/packages-pgadmin-org.gpg] https://ftp.postgresql.org/pub/pgadmin/pgadmin4/apt/$(lsb_release -cs) pgadmin4 main" > /etc/apt/sources.list.d/pgadmin4.list && apt update'

#
# Install pgAdmin
#

# Install for desktop mode only:
sudo apt install pgadmin4-desktop
```


Una vez instalado, deberíamos ser capaces de conectar contra nuestra base de datos configurando los siguientes datos:
- Abrir pgAdmin4
- "add New Server"
- Aquí es donde meteremos los datos de la instancia que hemos instalado en todos los pasos anteriores. Para ello, en la pestaña Connection, configurar: Host: localhost, Port: 5432, Maintenance database: postgres, Username: postgres, Password: "admin123"(o la password que haya seteado en el anterior apartado)
- Si todo va bien, en la parte derecha de nuestra pantalla podemos ver nuestra base de datos ya creada.

## Importar base de de datos
Una vez instalado el motor y comprobado que corre correctamente, vamos a proceder a importar una base de datos de prueba. La explicación está apoyada en los tutoriales oficiales de postgresql (https://www.postgresqltutorial.com/postgresql-sample-database/). Para impottar la base de datos será necesario realizar lo siguiente:
- Descargar la base de datos que vamos a utilizar: https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip


- Esta base de datos que vamos a importar, en clase entraremos más en detalle, pero presenta el siguiente modelo de datos:
![alt text](https://www.postgresqltutorial.com/wp-content/uploads/2018/03/dvd-rental-sample-database-diagram.png)


- Para importar esta base de datos en nuestro motor postgre, lo haremos a través del IDE. Para ello seguiremos los pasos del siguiente enlace, a partir del apartado "Load the DVD Rental database using the pgAdmin": https://www.postgresqltutorial.com/load-postgresql-sample-database/


- Una vez importada correctamente, navengando en la derecha sobre: dvdrental -> schemas -> Tables, deberíamos ser capaces de ver todas las tablas cargadas. Algo así:

*![alt text](https://raw.githubusercontent.com/AgustinICAI/CursoCeroMBD/master/images/BaseDatosCargada.png)



