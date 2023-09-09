# Tipos de Predicados
- Un predicado expresa una condición entre valores, según sean estos, el resultado puede ser Verdadero, Falso o Desconocido.
- Las condiciones de las SELECT se definen como predicados.
- Se especifican en la clausula WHERE y otras…
- Se clasifican en Predicados Simples y Compuestos.

## Predicados básicos
- Son Predicados Simples o de comparación.
- Expresan condiciones de comparación entre dos valores.
- Utilizando los signos: <, >, = y sus combinaciones.
- Si alguno o ambos comparandos son NULL el predicado toma valor “Desconocido”.
- El segundo comparando puede ser otra expresión o el resultado de otra sentencia SELECT (Select Subordinada).


## Predicado NULL
- Permite saber si el valor de un atributo o expresión, en una fila determinada, es o no NULO.
- Tomará valor Verdadero o Falso, pero nunca Desconocido.

### Ejemplo
Peliculas que no se han devuelto
```sql
select * from RENTAL WHERE RETURN_DATE IS NULL
```

## Predicado LIKE
Sirve para buscar combinaciones de caracteres que cumplan ciertas condiciones.
- Se usan caracteres comodines. Estos comodines son:
    - '%': contiene cualquier carácter alfanumérico
    - '_': contiene 1 caracter


## Ejemplos para preparar en casa

1) Seleccionar los clientes (tabla customer) que están activos
2) Obtener los diferentes nombres que empiezan por la letra A de forma descendente.
3) Obtener las peliculas de menos de 60 minutos
4) Selecionar el idioma de las películas de más de 3 horas


## Predicado IN
El predicado es cierto cuando la expresión o expresiones están dentro de una lista de valores o constantes.
Obtener las películas en inglés:
```sql
select * from film
where language_id in (select language_id 
					  from language 
					  where name like 'English%')
```


## Ejemplos para preparar en casa

1) Seleccionar los clientes cuyo código postal comience por 10
2) Obtener el numero de clientes que viven en el código de postal '1027'
3) Obtener el numero de clientes que comparten código postal con el cliente con id '299'

## Predicados compuestos
- Son combinaciones de otro predicados, simples o compuestos.
- Usando los operadores AND, OR, NOT, para combinar los predicados.

## Ejemplos para preparar en casa

1) Obtener las peliculas con calificacion "PG-13" y que duren más de 90 minutos
2) Obtener las películas cuya duración sea superior a la media y no sean "PG-13"
