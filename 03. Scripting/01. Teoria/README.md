Bash es también es un lenguaje interpretado muy utilizado para la creación de scripts en Linux.
Estos scripts contienen una serie de instrucciones que se comunicarán con el Bash (si es el que se indica por defecto) para que este ejecute las acciones pertinentes.
Las instrucciones a utilizar son las mismas que se lanzarían en una consola de bash, pero la ventaja que aporta es el hecho de poder incluir estructuras condicionales, bucles, etc.

## Inicio script

```
#!/bin/bash

echo "hola"
```

- #!/bin/bash: muestra que el código es un script de bash


## Variables

Variables Globales. Son aquellas que están disponibles de forma global en el sistema, y son validas y accesibles desde todas las shell.
Variables Locales. Son aquellas que solo son validas y están disponibles para la shell o sesión actual. Son útiles para almacenar información más efímera, como puede ser, por ejemplo, el directorio de trabajo actual

### Listar Variables Existentes

Una de las formas más completas para conocer todas las variables y funciones que conforman el entorno de Bash es a través del comando set. Si lo indicas tal cual, sin ningún argumento, te ofrecerá un listado con todas las variables del sistema (globales y locales), así como las funciones que confirman el entorno.
- set: lista todas las variables
- env: lista solo variables globales

### Creación de variables

```
VAR_EJEMPLO=valor_ejemplo
echo $VAR_EJEMPLO
```

Esto te imprimirá el mismo valor que le has asignado en el momento de su creación, es decir, valor_ejemplo.

Todas las variables creados de esta manera se crean como variables locales. Puedes comprobarlo tu mismo abriendo una nueva sesión de bash, y meter el mismo comando que antes:
```
echo $VAR_EJEMPLO
```

En este caso, no se imprimirá ningún valor, ya que la variable VAR_EJEMPLO es una variable local, y, por lo tanto, solo existe en la sesión de shell desde la que ha sido creado.

```
VAR_EJEMPLO_1=valor_ejemplo_1
export VAR_EJEMPLO_2=valor_ejemplo_2

bash #abrirá una aplicación con un nuevo bash dentro del bash actual
echo $VAR_EJEMPLO_1
echo $VAR_EJEMPLO_2
```

El comando export propaga las variables de entorno definidas en la sesión en todos los programas que se ejecutan dentro de la misma sesión.

### Salida de comando a variable
```
usuarios_home=$(ls /home)
echo $usuarios_home
```

De esta forma podemos introducir la salida de un comando en una variable de entorno

### Comentarios
Los comentarios son una parte esencial en cualquier pieza de código. Son partes del código que no se ejecutan. Sirven explicar el código.

```
#Esto es un comentario en Bash.
<código> 
#Este es otro comentario.
```


### Variables especiales

- $0 representa el nombre del script
- $1 – $9 los primeros nueve argumentos que se pasan a un script en Bash
- $# el número de argumentos que se pasan a un script
- $@ todos los argumentos que se han pasado al script
- $? la salida del último proceso que se ha ejecutado





### Condicionales.If

```
if [condición]; 
then 
    <código> 
else 
    <código> 
fi
```

Ejemplo

```

echo "En un lanzamiento de dados, indica cara o cruz"
read A

if [ $A = "cara" ];
then 
    echo "Acertaste"
fi
```


### Condicionales.BucleFor

```
for <condición>
do
    <código>
done

```

```
for i in 1 2 3 4 5
do
 echo "Hello $i"
done
```








