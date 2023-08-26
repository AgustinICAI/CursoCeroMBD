# Consulta sobre varias tablas

Es posible manejar varias tablas en una sentencia Select. Básicamente se puede manejar de dos formas:
- Mediante producto cartesiano: Bastaría con poner los nombres de las tablas en la clausula FROM.
- Mediante Selects Subordinadas: Haciendo referencia a campos de otras tablas en Select subordinadas a la principal.

## Calificación de nombres
- Los nombres de columna dentro de una tabla son diferentes, cuando operamos sobre el campo de una tabla basta con designarla.
- Por el contrario al intervenir varias tablas puede ocurrir que existan columnas con el mismo nombre.
- Para diferenciarlas hay que indicar a que tabla pertenece dicho atributo o columna referida. Se califican los nombres.
```
Ej.-
PERSONAS.CIUDAD
CIUDADES.CIUDAD
```

## Sentencias subordinadas
Son sentencias subordinadas en las que se especifica algún atributo de alguna tabla mencionada en la cláusula FROM de la sentencia antecedente.

- Dentro de una sentencia SELECT se pueden describir otras. (sentencias subordinadas).
-  Se pueden especificar en las cláusulas WHERE y HAVING como parte de los predicados:
    - Predicados Básicos. (comparación)
    - Predicados Cuantificados. (ANY, SOME, ALL)
    - Predicados IN.
    - Predicados EXISTS.

- Se llama sentencia externa, a la que no esta subordinada a ninguna. O también sentencia de primer nivel.


## Producto Cartesiano
En la cláusula FROM se especifica las lista de tablas separadas por coma.
- La siguiente cláusula (normalmente WHERE) se aplicará a una tabla que resulta de todas las combinaciones posibles entre las filas de las distintas tablas y las columnas serán la suma de ellas.
```
PERSONAS (DNI, NOMBRE, CIUDAD)
CIUDADES (CIUDAD, NºHAB, EXT)
SELECT *
FROM CIUDADES, PERSONAS
```
