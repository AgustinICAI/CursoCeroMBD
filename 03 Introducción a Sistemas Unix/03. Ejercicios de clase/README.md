# Tarea 0

1. Empezar directorio personal (cd /home/usuarioXXXX o cd ~). Se puede comprobar el directorio en el que se está con pwd.
2. Cree un directorio con el nombre tarea0.
3. Vaya a su directorio tarea0.
4. Cree el árbol dir1/dir2/dir3/dir4.
5. Liste el contenido del directorio actual de forma recursiva.
6. Suprima el directorio dir1. ¿Es posible?
7. Suprima el árbol de directorios dir1/dir2/dir3/dir4, después verifíquelo listando el directorio actual de forma recursiva.
8. Cree ahora el árbol siguiente en su directorio actual (/home/usuarioXXXX/tarea0) sin cambiar de directorio:
```
.
./color/frio
./forma/angulo
./forma/curva
```
Pistas:

1. Utilice el comando cd.
2. Utilice el comando mkdir. Asegúrese de especificar correctamente la ruta del directorio a crear, ya sea como ruta relativa, absoluta o personal.
4. Utilice el comando mkdir con la opción adecuada.
5. Utilice el comando ls con la opción adecuada.
6. Utilice el comando rmdir.
7. Utilice el comando rmdir con la opción adecuada.
8. Es posible pasar varios argumentos en el mismo comando mkdir.

# Tarea 1

1. Crear un nuevo usuario pepe.
2. Crear un nuevo fichero ./parapepe.txt y comprobar los permisos que hay.
3. Dar permisos al usuario pepe para leer y escribir el fichero o añadir pepe al mismo grupo que pertece tu usuario.
4. Probar a conectarnos con el usuario pepe y verificar que podemos modificar el fichero.
5. Salir de la sesión de pepe
6. Borrar el usuario de pepe.

Pistas:
1. Utilizar useradd
2. Utilizar touch, vi, nano, gedit o echo "">parapepe.txt. ¿Que diferencias hay?
2. ls -l ?
3. chmod o añadir pepe a un grupo. El comando groups se puede utilizar para saber a que grupo pertenece un usuario
4. sudo su pepe
5. Salir con ctl-c o exit
6. usar userdel

# Tarea 2

Prueba de instalar un programa con apt-get install. Vamos a instalar un commando que nos permite mostar banners con caracteres de forma gráfica. Hay que instalarlo con los siguientes comandos:

```
$ sudo apt-get update
$ sudo apt-get install sysvbanner
$ banner labex
```

Probar también con otro comando *printerbanner*
$ printerbanner -w 50 A
image desc

Con -w se indica el ancho deseado. Lo usamos ya que por defecto la consola que se abre no suele ser muy ancha.

Hay otros dos comandos similares llamados *toilet* y *figlet* con los que se puede probar.


# Tarea 3

Encontrar todos los ficheros con los sufijos .conf en etc.

# Tarea 4 

Cuando meto un comando en la shell, ¿cómo sabe la shell ejecutar el programa que quiero? Esto se realiza con la variable de entorno PATH. Path almacena las rutas a donde ir a buscar los ejecutables.

1. Ver el contenido de la variable path.
```
$ echo $PATH
```

Veréis un output parecido a este 
```
/home/b0904853/.local/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin
```

Ahora vamos a probar a generar nuestro primer script en bash y un pequeño programa en c.
1. Crear el fichero del shell script:
```
$ gedit hello_shell.sh
```

2. Añadir lo siguiente al script. No olvidar de copiar la primera línea, es muy importante:
```
#! /bin/bash

for ((i=0; i<10; i++));do
    echo "hello shell $i"
done

exit 0
```

3. Dar permisos para ejecutar y correr el script
```
$ chmod 755 hello_shell.sh
$ ./hello_shell.sh
```

4. Crear un programa ahora en c "hello world":
```c
$ gedit hello_world.c o nano hello_world.c
#include <stdio.h>

int main(void)
{
    int i = 0;
    for(i=0;i<10;i=i+1)
        printf("hello c %i!\n",i);
    return 0;
}
```
5. Salvar y usar gcc para compilar el programa

```
$ gcc hello_world.c -o hello_world
```

6. El programa que ha generado gcc, ya tiene permisos de ejecucion.
Ahora crear un directorio llamado mybin en tu home del usuario y mover los dos programillas que hemos realizado.

```
$ mkdir mybin
$ mv hello_shell.sh hello_world mybin
```

7. Ahora ya podemos correr los dos programas realizados.

$ cd mybin
$ ./hello_shell.sh
$ ./hello_world

8. A nivel teórico, ¿Que diferencia hay entre los dos? ¿Cual es más eficiente? ¿porque no podemos lanzarlo como "hello_shell.sh? ¿Que habría que hacer si quisieramos meter este directorio en nuestro PATH y para que serviría?


# Tarea 5

Realizar un programa python que muestre por pantalla una variable de entorno definida desde la shell
1. Crear una variable MIVARIABLE con el contenido que se desee
2. Volcar en un fichero app.py el siguiente contenido
```python
import os
print (os.environ['MIVARIABLE'])
```
3. Lanzar el programa con python3 app.py

Pistas
1. Usar export


# Tarea 6
Vamos a trabajar con pipes y redirecciones y ayudarnos de algún comando no explicado hasta ahora como cut, sort, uniq o wc.
1. mkdir tarea6
2. Descargar este zip y descomprimirlo dejando el contenido en tarea6: https://drive.google.com/file/d/1bxtpR8wNEG_dy3DlTGyvI_I-WPNkNDGv/view?usp=sharing (google drive es un poco cabroncete para meter enlaces descargables, así que hacedlo a mano)
3. unzip ./tarea6/ficheros.zip

4. wc *.txt. Entra a ese directorio usando el comando cd y ejecuta el comando. wc es el comando “word count”: cuenta el número de líneas, palabras y caracteres de un archivo. El * en *.txt coincide con cero o más caracteres, por lo que la terminal convierte *.txt en una lista de todos los archivos .txt en el directorio actual.
```
$ cd tarea6
$ wc *.txt
```

5. Si ejecutamos wc -l en lugar de wc, la salida sólo muestra el número de líneas por archivo:
```
wc -l *.txt
```

También podemos usar -w para obtener sólo el número de palabras, o -c para obtener sólo el número de caracteres.

6. ¿Cuál de estos archivos es el más corto? Es una pregunta fácil de responder cuando sólo hay seis archivos, pero ¿y si hubiera 6,000? Nuestro primer paso hacia una solución es ejecutar el comando:
```
wc -l *.txt > lengths.txt
```
El símbolo “mayor que”, >, le dice a la terminal que redireccione la salida del comando a un archivo en lugar de imprimirlo en la pantalla. (Es por eso que no hay salida de pantalla: en vez de mostrarlo, todo lo que wc imprime se ha enviado al archivo lengths.txt.) Si no existe el archivo, la terminal lo creará. Si el archivo existe, será sobrescrito silenciosamente, lo que puede provocar pérdida de datos y, por lo tanto, requiere cierta precaución. ls lengths.txt confirma que el archivo existe:
```
$ ls lengths.txt
```

Ahora podemos enviar el contenido de lengths.txt a la pantalla usando cat lengths.txt. cat significa “concatenate” (concatenar): imprime el contenido de los archivos uno tras otro. En este caso sólo hay un archivo, así que cat sólo nos muestra lo que éste contiene:

```
$ cat lengths.txt
```

7. Continuaremos usando cat en esta lección, por conveniencia y consistencia, pero tiene la desventaja de que siempre vuelca todo el archivo en la pantalla. En la práctica es más útil el comando less, que se utiliza como $ less lengths.txt. Este comando muestra sólo el contenido del archivo que cabe en una pantalla y luego se detiene. Puedes avanzar a la siguiente pantalla presionando la barra espaciadora, o retroceder presionando b. Para salir, pulsa q.

Ahora utilizemos el comando sort para ordenar el contenido. También usaremos el indicador -n para especificar que el tipo de orden que requerimos es numérico en lugar de alfabético. Esto no cambia el archivo; sólo despliega el resultado ordenado en la pantalla:

```
$ sort -n lengths.txt
```

Podemos poner la lista de líneas ordenada en otro archivo temporal llamado sorted-lengths.txt poniendo > sorted-lengths.txt después del comando, así como usamos > lengths.txt para poner la salida de wc en lengths.txt. Una vez que hayamos hecho eso, podemos ejecutar otro comando llamado head para obtener las primeras líneas de sorted-lengths.txt:
```
$ sort -n lengths.txt > sorted-lengths.txt
$ head -n 1 sorted-lengths.txt
```
El parámetro -n 1 con head indica que sólo queremos la primera línea del archivo; -n 20 conseguirá las primeras 20, y así sucesivamente. Dado que sorted-lengths.txt contiene las longitudes de nuestros archivos ordenados de menor a mayor, la salida de head debe ser el archivo con menos líneas.

8. La barra vertical, |, entre los dos comandos se denomina pipe (pronunciado paip). El pipe le dice a la terminal que queremos usar la salida del comando a la izquierda como entrada al comando de la derecha. La computadora puede crear un archivo temporal si es necesario, copiar datos de un programa a otro en la memoria, o cualquier otra cosa que sea necesaria; no es necesario que lo entendamos para hacerlo funcionar.

Nada nos impide encadenar pipes consecutivamente. Por ejemplo, puedes enviar la salida de wc directamente a sort, y luego la salida resultante a head. Así, primero usamos un pipe para enviar la salida de wc a sort:

```
$ wc -l *.txt | sort -n
$ wc -l *.txt | sort -n | head -n 1

```

9. ¿Cuál es la diferencia entre:

```
$ echo hello > testfile01.txt
y:
$ echo hello >> testfile02.txt
```

Pista: Intenta ejecutar cada comando dos veces seguidas y después examinar los archivos de salida.

10. En nuestro directorio actual, queremos encontrar los 3 archivos que tienen el menor número de líneas. ¿Cuál de los siguientes comandos funcionaría?

    1. wc -l * > sort -n > head -n 3
    2. wc -l * | sort -n | head -n 1-3
    3. wc -l * | head -n 3 | sort -n
    4. wc -l * | sort -n | head -n 3


11. Un archivo llamado animals.txt contiene los siguientes datos:
```
2012-11-05,deer
2012-11-05,rabbit
2012-11-05,raccoon
2012-11-06,rabbit
2012-11-06,deer
2012-11-06,fox
2012-11-07,rabbit
2012-11-07,bear
```

¿Qué texto pasa a través de cada uno de los pipes y qué incluye el redireccionamiento final en el siguiente pipeline?

```
$ cat animals.txt | head -n 5 | tail -n 3 | sort -r > final.txt
```

12. Pregunta para clase: Un archivo ./animals.txt contiene 586 líneas de datos en el siguiente formato:

```
2012-11-05,deer
2012-11-05,rabbit
2012-11-05,raccoon
2012-11-06,rabbit
...
```
 ¿qué comando usarías para producir una tabla que muestre el recuento total de cada tipo de animal en el archivo?

1. grep {deer, rabbit, raccoon, deer, fox, bear} animals.txt | wc -l
2. sort animals.txt | uniq -c
3. sort -t, -k2,2 animals.txt | uniq -c
4. cut -d, -f 2 animals.txt | uniq -c
5. cut -d, -f 2 animals.txt | sort | uniq -c
6. cut -d, -f 2 animals.txt | sort | uniq -c | wc -l

pista 1: cut -d , -f 2 animals.txt genera la siguiente salida corta la entrada con el delimitador "," y se queda con el segundo campo
pista 2: El comando *uniq* elimina las líneas duplicadas adyacentes de su entrada
