# Sentencia SELECT

Una de las tareas más comunes, cuando trabaja con la base de datos, es consultar datos de tablas mediante la instrucción SELECT.

La instrucción SELECT es una de las declaraciones más complejas de PostgreSQL. Tiene muchas cláusulas que puede utilizar para formar una consulta flexible.


La declaración SELECT tiene las siguientes cláusulas:

- SELECT filas distintas mediante el operador DISTINCT.
- Ordene las filas usando la cláusula ORDER BY.
- Filtrar filas usando la cláusula WHERE.
- Seleccione un subconjunto de filas de una tabla usando la cláusula LIMIT o FETCH.
- Agrupe filas en grupos usando la cláusula GROUP BY.
- Filtrar grupos usando la cláusula HAVING.
- Unir con otras tablas usando joins, como: INNER JOIN, LEFT JOIN, FULL OUTER JOIN, CROSS JOIN.
- Realizar operaciones de conjuntos utilizando UNION, INTERSECT y EXCEPT.

## SELECT Y FROM

Comencemos con la forma básica de la instrucción SELECT que recupera datos de una sola tabla.

A continuación, se ilustra la sintaxis de la instrucción SELECT:
```sql
SELECT
   select_list
FROM
   table_name;
```

Examinemos la sentencia SELECT con más detalle:

Primero, se indica lo que queremos seleccionar: una columna o una lista de columnas en una tabla de la que desea recuperar datos. Si especifica una lista de columnas, debe colocar una coma (,) entre dos columnas para separarlas. Si desea seleccionar datos de todas las columnas de la tabla, puede usar una abreviatura de asterisco (*) en lugar de especificar todos los nombres de las columnas. La lista de selección también puede contener expresiones o valores literales.

En segundo lugar, hay que especificar el nombre de la tabla desde la que desea consultar los datos después de la palabra clave FROM.

La cláusula FROM es opcional. Si no consulta datos de ninguna tabla, puede omitir la cláusula FROM en la instrucción SELECT.

PostgreSQL evalúa la cláusula FROM antes que la cláusula SELECT en la declaración SELECT:
FROM -> SELECT

Es importante que SQL no distingue entre mayúsculas y minúsculas. Significa que SELECT es equivalente a escribir "Select" o "select". Por convención, usaremos todas las palabras clave SQL en mayúsculas para facilitar la lectura de las consultas.

### Primer ejemplo de SELECT

Vamos a usar el motor Postgre SQL y la base de datos importada, para empezar a trabajar con la declaración SELECT para consultar datos de un ejemplo de columna. Este ejemplo usa la instrucción SELECT para encontrar los nombres (first_name) de todos los clientes de la tabla de clientes(customer):
```sql
SELECT first_name FROM customer;
```

Ejemplo de salida:
*![alt text](https://raw.githubusercontent.com/AgustinICAI/CursoCeroMBD/master/images/sql001.png)

En el ejemplo se ha añadido un punto y coma (;) al final de la instrucción SELECT. El punto y coma no forma parte de la instrucción SQL. Se utiliza para señalar a PostgreSQL el final de una declaración SQL. El punto y coma también se utiliza para separar dos sentencias SQL.

### Uso de la declaración SELECT para consultar datos de varias columnas de ejemplo
Si queremos seleccionar nombre, apellido y correo electrónico de los clientes, se puede especificar estos nombres de columna en la cláusula SELECT como se muestra en la siguiente consulta:
```sql
SELECT first_name,
   last_name,
   email
FROM
   customer;
```
###  Uso de la declaración SELECT para consultar todas las columnas de una tabla
La siguiente consulta usa la instrucción SELECT para seleccionar datos de todas las columnas de la tabla de clientes:
```sql
SELECT * FROM customer;
```

En este ejemplo, usamos un asterisco (\*) en la cláusula SELECT, que es una forma abreviada de todas las columnas. En lugar de enumerar todas las columnas en la cláusula SELECT, solo usamos el asterisco (*) para ahorrar algo de escritura.

Sin embargo, no es una buena práctica usar el asterisco (*) en la declaración SELECT cuando inserta declaraciones SQL en el código de la aplicación como Python, Java, Node.js o PHP debido a las siguientes razones:

- Rendimiento de la base de datos. Imagina que tienes una tabla con muchas columnas y muchos datos, la instrucción SELECT con la abreviatura de asterisco (*) seleccionará datos de todas las columnas de la tabla, lo que puede no ser necesario para la aplicación.
- Rendimiento de la aplicación. La recuperación de datos innecesarios de la base de datos aumenta el tráfico entre el servidor de la base de datos y el servidor de aplicaciones. En consecuencia, las aplicaciones pueden tardar más en responder y ser menos escalables.

Por estas razones, es una buena práctica especificar explícitamente los nombres de las columnas en la cláusula SELECT siempre que sea posible para obtener solo los datos necesarios de la base de datos.

Y solo debe usar la abreviatura de asterisco (*) para las consultas ad-hoc que examinan datos de la base de datos.

## Uso de "alias"

Un "alias" de columna le permite asignar un nombre temporal a una columna o expresión en la lista de selección de una instrucción SELECT. El alias de columna existe temporalmente durante la ejecución de la consulta.

A continuación, se ilustra la sintaxis del uso de un alias de columna:
```sql
SELECT column_name AS alias_name
FROM nombre_tabla;
```

En esta sintaxis, al column_name se le asigna un alias alias_name. La palabra clave AS es opcional, por lo que puede omitirla así:
```sql
SELECT nombre_columna nombre_alias
FROM nombre_tabla;
```
La siguiente sintaxis ilustra cómo establecer un alias para una expresión en la cláusula SELECT:

### Ejemplo de alias de columna de PostgreSQL
Usaremos la tabla de "customer" de la base de datos de muestra para mostar cómo trabajar con alias de columna.

```sql
SELECT
   first_name,
   last_name AS apellido
FROM customer;

SELECT
   first_name,
   last_name apellido
FROM customer;
```

## Ejemplo del uso de expresiones en la SELECT
La siguiente consulta devuelve los nombres completos de todos los clientes. Construye el nombre completo concatenando el nombre, el espacio y el apellido:
```sql
SELECT
   first_name || ' ' || last_name as nombre_completo
FROM
    customer;
```

Se usa el || como el operador de concatenación que concatena una o más cadenas en una sola cadena.

## Ejemplo de ORDER BY
La sentencia ORDER BY permite ordenador los elementos que se devuelven por el campo, por ejemplo, si del ejemplo anterior, quisieramos ordenar la salida, esta sería la query:
```sql
SELECT
   first_name || ' ' || last_name as nombre_completo
FROM
    customer
ORDER BY 1;

/*También se podría haber escrito así*/
SELECT
   first_name || ' ' || last_name as nombre_completo
FROM
    customer
ORDER BY nombre_completo;
```



## Funciones de agregación
Estas funciones me permiten realizar cálculos u operaciones sobre los registros de una tabla y sobre una o varias columnas. Las funciones de agregación SQL más usadas son las siguientes:
- MIN(del campo que se desee)
- MAX(campo)
- AVG(campo)
- SUM(campo)
- count(*)
