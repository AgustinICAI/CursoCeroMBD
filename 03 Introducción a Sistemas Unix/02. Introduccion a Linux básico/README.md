# Directorios principales de linux

La siguiente tabla muestra los directorios de mayor importancia en Linux


| Directorio | Comentario |
| ---------- | ---------- |
| /etc | Ficheros de configuración de la máquina. |
| /etc/rc.d | Ficheros de configuración del arranque. |
| /sbin | Ficheros esenciales del arranque, montaje del /usr y recuperación del sistema. |
| /bin | Ejecutables del sistema |
| /lib | Bibliotecas de los programas de /sbin y /bin. |
| /usr | Ficheros compartibles por todo el sistema. Tiene un árbol de subdirectorios con una estructura similar al raíz. Suele montarse sólo para lectura. |
| /usr/local | Programas instalados independientes del sistema operativo. |
| /var | Ficheros varios (administrativos, históricos, bloqueos, ...). |
| /tmp | Ficheros temporales. |
| /home/xxxx | Datos de las cuentas de los usuarios |


Casi la totalidad de los directorios está gestionada por root, por lo que deben estar bien protegidos contra intrusiones de otros usuarios.

# Comandos básicos

- Mostrar el contenido del directorio raíz. Nótese que el símbolo $ es el punto indicativo del intérprete de mandatos.
```
$ls
```

- Ver el contenido del directorio /usr incluyendo los archivos ocultos. Un archivo se considera oculto cuando su nombre comienza por punto. El directorio actual se denota por el fichero . (punto) y el directorio padre por .. (punto punto).
```
$ ls –a /home/usuario
```

- Examinar el contenido completo del directorio actual. La salida se divide en varias columnas, mostrando: permisos, número de enlaces, propietario, grupo, tamaño, fecha y nombre.
```
$ ls –al
```

- Conocer todos las variantes del comando que se pueden lanzar
```
$ls --help
```

- Conocer directorio actual
``` 
pwd
```

- La orden man permite leer las páginas de manuales del sistema operativo y obtener una ayuda completa de cualquier mandato Linux
```
man ls
```

# Directorios: rutas absolutas y relativas
- Los ficheros y directorios se agrupan en forma de árbol, cuyo directorio raíz se denota por /. El mismo carácter barra inclinada se utiliza como separador de subdirectorios. 
- Para hacer referencia a un fichero en el directorio actual, basta con dar su nombre. Sin embargo, el camino completo de dicho fichero se obtiene precediendo al nombre del fichero el camino completo del directorio que lo contiene.
- Pero también podemos referirnos al mismo fichero de forma relativa respecto al directorio actual. Teniendo en cuenta que el directorio padre de uno dado se denota por . (directorio actual) o .. (directorio padre)

# Permisos
Uno de los elementos fundamentales de la seguridad en UNIX es el buen uso de los permisos para acceder a ficheros y directorios, ya que permiten gestionar los permisos y visibilidad entre usuarios.

- Cada usuario tiene un nombre de conexión único en el ordenador y pertenecerá a uno o varios grupos de usuarios
- Teniendo esto en cuenta, un fichero o directorio tiene 3 conjuntos de permisos: permisos para el propietario, para el grupo y para el resto de usuarios.
- El propietario de dicho fichero puede seleccionar qué permisos desea activar y cuales deshabilitar.
Ejemplo:
```
$ls -l
```
- 1 carácter mostrando el tipo: fichero (-), directorio (d), enlace (l), tubería (p), …
- 3 caracteres para los permisos del propietario.
- 3 caracteres para los permisos para otros usuarios del grupo.
- 3 caracteres para los permisos para el resto de usuario.

- Los ficheros pueden tener estos permisos:
  - Lectura (r): el usuario puede leer el fichero.
  - Escritura (w): el usuario puede escribir en el fichero.
  - Ejecución (x): el usuario puede ejecutar el fichero (siempre que sea un ejecutable o un guión de intérprete de mandatos).

- Los directorios pueden tener estos permisos:
  - Lectura (r): el usuario puede leer el contenido del directorio.
  - Escritura (w): el usuario puede crear, modificar y borrar entradas del directorio.
  - Acceso (x): el usuario puede acceder al directorio, permitiendo colocarse en él como directorio actual (utilizando el mandato cd). Este tipo de permiso permite proteger cierta información de un d

| Mandato | Permiso  directorio origen | Permisos fichero | Permisos directorio destino |
| ------- | -------------------------- | ---------------- | --------------------------- |
| ls | R | No aplicable | No aplicable |
| mkdir | W, X | No aplicable | No aplicable |
| rmdir | W, X | No aplicable | No aplicable |
| cat | X | R | No aplicable |
| rm | W, X | - | No aplicable |
| cp | X | R | W, X |
| mv | W, X | - | W, X |

Ejemplo
- El usuario juan pertenece al grupo ventas.
- El usuario luis está incluido en los grupos admin y general.
- La usuaria maria pertenece a los grupos ventas y general.

```
luis$ ls –al /home/juan/datos

rwxrwxr-x 1 juan ventas .
rwx--x--x 4 juan ventas ..
rw-rw-r-- 1 maria ventas enero.txt
rw------- 1 juan ventas febrero.txt
```
| Comando | Resultado |
| ------------------- | ----------------------------------------------- |
| luis$ cd /home/juan | ****** |
| luis$ cd /home/juan/datos | ****** |
| luis$ cp enero.txt  /home/luis | ****** |
| luis$ cat febrero.txt | ****** |
| luis$ vi enero.txt | ****** |

TIPS: el comando cd (change directory), cp (copy), cat mostrar el contenido y vi comando para abrir y editar un fichero.

Los permisos muchas veces se represental en octal, siendo esta la equivalencia:
| Permiso | tipo | Equivalencia Octal |
| ------- | ---- | ------------------ |
| R | (propietario) | 400 |
| W | (propietario) | 200 |
| X | (propietario) | 100 |
| R | (grupo) | 40 |
| W | (grupo) | 20 |
| X | (grupo) | 10 |
| R | (otros) | 4 |
| W | (otros) | 2 |
| X | (otros) | 1 |

## chmod
La orden chmod es la utilizada para cambiar los permisos de ficheros y directorios, permitiendo tanto la descripción numérica como la simbólica.
Ejemplo para alinear permisos del ejemplo anterior de . y ..
```
chmod -R 775 ..
```
## chown
Cambiar owner del fichero

## chgrp
Cambiar grupo del fichero

# Procesos
Puede entenderse por proceso todo programa o mandato en ejecución. Un proceso tiene las siguientes características:
- Consta de zona de código, de datos y de pila.
- Los procesos existen en una jerarquía de árbol (varios hijos, un sólo padre).
- El sistema asigna un identificador de proceso (PID) único al iniciar el proceso.
- El planificador de tareas asigna un tiempo compartido para el proceso según su prioridad (sólo root puede aumentar la prioridad de un proceso).
- Cada proceso almacena su identificador (PID) el de su proceso padre (PPID), el propietario y grupo del proceso y las variables de entorno.
Tipos de procesos:
- Ejecución en 1er plano: proceso iniciado por el usuario o interactivo.
- Ejecución en 2do plano: proceso no interactivo que no necesita ser iniciado por el usuario. Tiene una prioridad menor que un proceso interactivo.
- Procesos especiales:
  - Proceso servidor o demonio: proceso en 2º plano siempre disponible y que da servicio a varias tareas (debe ser propiedad del usuario root).
  - Proceso zombi: proceso parado que queda en la tabla de procesos hasta que termine la ejecución de su padre. Este hecho se produce cuando el proceso padre no recoge el código de salida del proceso hijo.
  - Proceso huérfano: proceso en ejecución cuyo padre ha finalizado. El nuevo identificador de proceso padre (PPID) coincide con el identificador del proceso init (1).
```
$ps (lanzar ejemplo de sleep 100 &)
$ps -fu
$top
$ps -aux
$kill
```

# Redirecciones y tuberías
## Redirecciones
Para cada proceso en ejecución el sistema abre 3 ficheros especiales:
0. Entrada normal (stdin): datos de entrada por teclado.
1. Salida normal (stdout): datos de salida a la pantalla.
2. Salida de error (stderr): datos de errores a la pantalla.

Estos valores por omisión pueden modificarse utilizando las redirecciones. Es importante no confundir la redirección con los parámetros de un mandato. Los operadores de redirección son:
| operador | utilidad |
| -- | -------------------------------------- |
| <  | Redirigir la entrada desde un fichero. |
| >  | Redirigir la salida a un fichero. |
| >> | Añadir la salida a un fichero. |
| 2> | Redirigir la salida de error a un fichero. |
| 2>> | Añadir la salida de error a un fichero. |


- El fichero /dev/null se utiliza como papelera para hacer redirecciones nulas.
Un filtro es un programa que lee datos de la entrada normal, los procesa y escribe los resultados
en la salida normal. Filtros típicos de UNIX son los mandatos grep, sort, cut, sed, …
Una asociación es enviar una redirección al mismo fichero que se utiliza para otra redirección.
Es muy importante saber que las sustituciones se realizan de izquierda a derecha y se representan
de la siguiente manera:

| operador | utilidad |
| -- | ----------------------------- |
| 0  | Sustituye la entrada normal.  |
| &1 | Sustituye la salida normal.   |
| &2 | Sustituye la salida de error. |

Ejemplos que ilustran los conceptos anteriores.
- Ordenar la entrada del fichero fich1.ent, añadir la salida a fich2.sal e ignorar los errores:
```
$ sort <fich1.ent >>fich2.sal 2>/dev/null
```
- Copiar datos.sal y los posibles errores de esta operación en datos.copia.
```
$ cat datos.sal >datos.copia 2>&1
```
- Listar todo el árbol de directorios, mandar los errores a la salida normal (pantalla) y redirigir
la salida normal a todoelarbol.sal:
```
$ ls –alR / 2>&1 >todoelarbol.sal
```
- Buscar todos los directorios, mandar la salida a direc.sal, los errores a direc.err y hacer la
ejecución del mandato en 2º plano:
```
$ find / -type d –ls >direc.sal 2>direc.err &
```
## Tuberías
Una tubería es un mecanismo entre 2 procesos por el cual la salida normal de uno de ellos se sincroniza con la entrada normal del segundo. Para representar una tubería los procesos se separan por el carácter barra vertical (|).
Los filtros suelen utilizarse para procesar datos recogidos por otras órdenes utilizando este mecanismo.
Más ejemplos:
• Mostrar el número de entradas no ocultas del directorio actual:
```
$ ls | wc -w
```
• Contar el número de intérpretes bash que hay en ejecución en el ordenador:
```
$ ps -aux | grep bash | wc -l
```
• Mandar el contenido del directorio a ls.sal y mostrarlo en pantalla con orden inverso (la orden tee copia la salida a pantalla y a un fichero):
```
$ ls | tee ls.sal | sort –r
```

# Otros comandos
## sudo 
Abreviatura de «SuperUser Do» (SuperUsuario hace), este comando te permite realizar tareas que requieren permisos administrativos o raíz. Sin embargo, no es aconsejable usar este comando para el uso diario, ya que podría ser fácil que ocurra un error si haces algo mal.

# grep
Otro comando básico de Linux que sin duda es útil para el uso diario es grep. Te permite buscar a través de todo el texto en un archivo dado.

Para ilustrar, grep azul notepad.txt buscará la palabra azul en el archivo del bloc de notas. Las líneas que contienen la palabra buscada se mostrarán.

## history

Cuando hayas estado utilizando Linux durante un cierto período de tiempo, notarás rápidamente que puedes ejecutar cientos de comandos todos los días. Como tal, ejecutar el comando history es particularmente útil si deseas revisar los comandos que ingresaste anteriormente.

## ping

Usa el comando ping para verificar tu estado de conectividad a un servidor. Por ejemplo, simplemente ingresando ping google.com, el comando verificará si puedes conectarte a Google y también medirá el tiempo de respuesta.

## top

Como un terminal equivalente al Administrador de tareas en Windows, el comando top mostrará una lista de los procesos en ejecución y la cantidad de CPU que utiliza cada proceso. Es muy útil monitorear el uso de los recursos del sistema, especialmente para saber qué proceso debe terminarse porque consume demasiados recursos.

## echo

Este comando se usa para mover algunos datos a un archivo. Por ejemplo, si deseas agregar el texto «Hola, mi nombre es John» en un archivo llamado nombre.txt, debes escribir echo Hola, mi nombre es John >> nombre.txt

## head
El comando head se usa para ver las primeras líneas de cualquier archivo de texto. De manera predeterminada, mostrará las primeras diez líneas, pero puedes cambiar este número a tu gusto. Por ejemplo, si solo deseas mostrar las primeras cinco líneas, escribe head -n 5 nombredearchivo.ext.

## tail
Este tiene una función similar al comando head, pero en lugar de mostrar las primeras líneas, el comando tail mostrará las últimas diez líneas de un archivo de texto. Por ejemplo, tail -n nombredearchivo.ext.

## df
Usa el comando df para obtener un informe sobre el uso del espacio en disco del sistema, que se muestra en porcentaje y KB. Si deseas ver el informe en megabytes, escribe df -m.

## du
Comando para verificar cuánto espacio ocupa un archivo o un directorio, el comando du (Uso del disco, en inglés). Sin embargo, el resumen de uso del disco mostrará números de bloque de disco en lugar del formato de tamaño habitual. Si deseas verlo en bytes, kilobytes y megabytes, agrega el argumento -h (human) a la línea de comando.

## diff
Para abreviar diferencia, el comando diff compara el contenido de dos archivos línea por línea. Después de analizar los archivos, genera las líneas que no coinciden. Los programadores a menudo usan este comando cuando necesitan hacer modificaciones al programa en lugar de reescribir todo el código fuente.

La forma más simple de usar este comando es diff archivo1.ext archivo2.ext

## tar
El comando tar es el comando más utilizado para guardar múltiples archivos en un tarball, un formato de archivo de Linux común que es similar al formato zip, con compresión opcional.

Este comando es bastante complejo con una larga lista de funciones, como agregar nuevos archivos a un archivo existente, enumerar el contenido de un archivo, extraer el contenido de un archivo y muchos más.

## find
Similar al comando locate, usando find también buscas archivos y directorios. La diferencia es que usas el comando find para ubicar archivos dentro de un directorio dado.

Como ejemplo, el comando find /home/ -name notas.txt buscará un archivo llamado notas.txt dentro del directorio de inicio y sus subdirectorios.

Otras variaciones al usar find son:

Para buscar archivos en el directorio actual, find . -name notas.txt
Para buscar directorios, / -type d -name notes.txt


# Acciones en la shell

- Usa el comando *clear* para limpiar el terminal si se está abarrotando con demasiados comandos pasados.

- Prueba el botón TAB para autocompletar lo que estás escribiendo. Por ejemplo, si necesitas escribir Documentos, comienza a escribir un comando (vamos con cd Docu, luego presione la tecla TAB) y el terminal completará el resto, mostrándote cd Documentos.

- Ctrl+C y Ctrl+Z se utilizan para detener cualquier comando que esté funcionando actualmente. Ctrl+C detendrá el comando de forma segura, mientras que Ctrl+Z forzará la detención.

- Puedes ejecutar varios comandos en un solo comando utilizando «;» para separarlos. Por ejemplo Comando1; Comando2; Comando 3. O usa && si solo deseas que se ejecute el siguiente comando cuando el primero sea exitoso.

# Editores de texto
## gedit

## vi

## nano

# Variables de entorno

Las variables de entorno son valores dinámicos que afectan los programas o procesos que se ejecutan en un servidor. Existen en todos los sistemas operativos y su tipo puede variar. Las variables de entorno se pueden crear, editar, guardar y eliminar.

Puedes ver la lista completa de variables de entorno de tu versión de Linux utilizando el comando printenv o env

# Retorno de un programa
Todo programa tras su finalización tiene un estado de finalización. En la variable $? es donde se almacena este resultado

## Export
Cómo crear una nueva variable de entorno en Linux. La sintaxis básica de este comando se vería así:
```
export VAR="value"
```
Si cambiamos la variable sin el export, sólo estaremos cambiando variable en nuestra shell, pero no propagará el cambio a todos los subshells o subprogramas que lancemos.

# Instalar programas en ubuntu 20

## apt-get
Es la forma estandar de instalar
```
sudo apt-get update
sudo apt-get install xxxx
sudo apt-get remove xxxx 
```

## Instalar deb
En ubuntu se pueden instalar los .deb haciendo dobleclick, pero también desde consola:
```
dpkg -i package_file.deb
```

## tar.gz

## SNAP

Es un sistema de archivos squashFS que contiene el código de tu aplicación y un archivo snap.yaml con metadata específica.  Contiene un sistema de solo lectura y, despues de instalada, una zona para escribir.
- Es auto contenido. Contiene integrado la mayoría de las librerías y runtimes que necesita y puede ser actualizado y revertido sin afectar el resto del sistema.
- Esta apartado del SO y las otras aplicaciones a través de mecanismos de seguridad, pero puede intercambiar contenido y funciones con otros snaps de acuerdo a politicas granulares controladas por el usuario y predeterminados del SO.

Traducido: independiza el almacenamiento y librerías de los programas que instalamos para evitar que choquen entre ellos.
