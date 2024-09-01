# INSTALACIÓN EN UBUNTU 

Para ello será necesario instalar en nuestra máquina virtual un motor de base de datos postgresql como se indica en los siguientes pasos. Abrir el terminal (ventana negra) y ejecutar:
## Instalación
- Ubuntu 22.04 no incluye por defecto el repositorio donde descargar postgre. Es por ello que es necesario añadirlo en un primer paso ejecutando los siguientes comandos:
 
    ```
    # Create the file repository configuration:
    sudo sh -c 'echo "deb https://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'

    # Import the repository signing key:
    wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -

    ```

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
