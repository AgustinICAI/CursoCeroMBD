# Principales Clases
## Object
public String toString(): Realiza una implementación genérica de cómo devolver la información de un objeto en forma de String.
```java
getClass().getName()+'@' +Integer.toHexString(hashCode()) 
```

## Math
[Math en JAVADOC](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html)

Todas las operaciones matemáticas se agrupan en la clase.
- Math como métodos de clase (estáticos).
### Funciones trigonométricas :
Math.cos(double);
Math.sin(double);
### Métodos de redondeo :
Math.round(double);
### Otros:
Abs, max,min, log, pow, exp

## String
[String en JAVADOC](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)
### Métodos:
- char charAt(int)
- int compareTo(String)
- int indexOf(String) 
- String substring(int,[int])
- int length()
- String toUpperCase()
- String toLowerCase()
- String trim()
- static String valueOf (int, float, …)
### búsqueda de sub-cadena:
    - boolean startsWith(String)
    - boolean endsWith (String)
### búsqueda/sustitución:
    - char charAt(int)
    - int indexOf(String)
    - int lastIndexOf(String)
### búsqueda de sub-cadena:
    - boolean startsWith(String)
    - boolean endsWith (String)
    - char charAt(int)
    - int indexOf(String)
    - int lastIndexOf(String)

## Calendar

Es una clase abstracta que sustituye a la clase Date del JDK 1.1, mejorando en consistencia e información suministrada.
- GregorianCalendar(int year, int month, int dayOfMonth) - Constructs a GregorianCalendar with the given date set *in the default time zone* with the default locale.
- Calendar.getInstance()
- set(f, value) changes calendar field f to value. In addition, it sets an internal member variable to indicate that calendar field f has been changed.
- Adds or subtracts the specified amount of time to the given calendar field, based on the calendar's rules. For example, to subtract 5 days from the current time of the calendar, you can achieve it by calling:
- add(f, delta) adds delta to field f. 
- getTimeInMillis() - Returns the current time as UTC milliseconds from the epoch. Epoch, January 1, 1970 00:00:00.000 GMT (Gregorian).

## Otras clases a revisar por el alumno
- LocalDate / LocalDateTime alternativa a Calendar desde JAVA8
[LocalDate como alternativa nueva a Calendar](http://tutorials.jenkov.com/java-date-time/localdate.html)
- Java String Format - Formatear de forma cómoda strings con números
[Enlace a String.Format](https://dzone.com/articles/java-string-format-examples)
- Locale - información de localismos de JAVA
[Locale](http://tutorials.jenkov.com/java-internationalization/locale.html)
- NumberFormat - Formatear números en base a los Locale
[Tutorial NumberFormat](https://www.geeksforgeeks.org/numberformat-class-java/)
- SimpleDateFormat - formatear fechas
[javadoc](https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
