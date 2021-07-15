# Garbage collector
- Unreachable objects : An object is said to be unreachable iff it doesn’t contain any reference to it. Also note that objects which are part of island of isolation are also unreachable.
- Even though the programmer is not responsible to destroy useless objects but it is highly recommended to make an object unreachable(thus eligible for GC) if it is no longer required.
- There are generally four different ways to make an object eligible for garbage collection.
  * Nullifying the reference variable (poniendo a null la variable)
  * Re-assigning the reference variable (reasignando la referencia del objeto a un nuevo objeto)
  * Object created inside method (Un objeto creado dentro de un scope { })
  * Island of Isolation (Objetos con más objetos en su interior)

```java
public class Test 
{ 
    public static void main(String[] args)
    { 
        Test t1 = new Test(); 
        Test t2 = new Test(); 
          
        // Poniendo a null la referencia
        t1 = null; 
        // Reasignando la variable a otro objeto
        t2 = new Test();
          
        // requesting JVM for running Garbage Collector 
        System.gc(); 
    }
}
```

# Modificadores
- Documentación oficial: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html

## Para clases
|Modifier||
|--------|------------------------------------------|
|public|The class is accessible by any other class|
|default|The class is only accessible by classes in the same package. This is used when you don't specify a modifier.|


## Para atributos, métodos y constructores
|Modifier|Class|Package|Subclass|World|
|--------|-----|-------|--------|-----|
|public|Y|Y|Y|Y|
|protected|Y|Y|Y|N|
|no modifier|Y|Y|N|N|
|private|Y|N|N|N|


# Paquetes
Previo a los paquetes la primera buena práctica es separar código de clases
- src/: "source" files to build and develop the project. 
- dist/: "distribution", the compiled code/library, also named public/ or build/.

Hay que seguir una estructura. [Naming a package](https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html). 

Separar por paquetes permite en la organizacion que no sea todo un caos, o lo intenta:
- es.icai.gitt.practicaDibujo.domain - contiene la lógica propia de la aplicación
- es.icai.gitt.practicaDibujo.ui - contiene la parte gráfica
- es.icai.gitt.practicaDibujo.util - contiene todas las clases desarrolladas de apoyo

A modo de simplificación, las primeras clases vamos a definirlas del tipo:
practicaDibujo.domain
practicaDibujo.ui
practicaDibujo.util

Para ello habrá que:
- Cambiar las clases de carpetas
- Revisar modificadores
- Revisar imports

```
javac ./src/practicaDibujo/dominio/*.java ./src/practicaDibujo/ui/*.java ./src/practicaDibujo/util/*.java -d "dist"
cd dist
java practicaDibujo.ui.AppDibujo02

```

