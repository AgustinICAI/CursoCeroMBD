## Conceptos básicos

HOLA

### Tabla
Es un conjunto de información que tiene relación entre sí

Por ejemplo, en una tabla de provincias, el número de habitantes que vive en cada provincia es un tipo de información relacionada con el nombre de la provincia, o el identificador asignado.

### Base de datos
Es el conjunto de tablas que describen una entidad de rango mayor. Las tablas pueden tener relaciones entre ellas y ser complementarias.

Lo normal es que para describir o trabajar con un sistema, sea necesario disponer de más de una tabla para comprender el todo, existiendo relaciones entre ellas.

Por ejemplo, para conocer los pueblos de España, necesitaremos una tabla de provincias, y otra de municipios, que están relacionadas entre sí porque cada municipio está vinculado a una y solo una provincia.

### Registros
Son la unidad básica que describe a un objeto o a una transacción. Las tablas están formadas por un conjunto de ellos, siempre siguiendo el mismo patrón en cada una de ellas.

### Campos o columnas
El registro está formado por uno o más campos, que son la unidad básica de información, y son una propiedad específica de un objeto o transacción.

Un registro, en el caso de la tabla provincias, estará formado por el identificador de provincia, el nombre de la provincia, y el censo de dicha provincia.

### Clave primaria o principal

Una clave primaria es una columna o un conjunto de columnas en una tabla cuyos valores identifican de forma exclusiva una fila de la tabla. Una base de datos relacional está diseñada para imponer la exclusividad de las claves primarias permitiendo que haya sólo una fila con un valor de clave primaria específico en una tabla.

### Clave foránea o extranjera

Una clave foránea es una columna o un conjunto de columnas en una tabla cuyos valores corresponden a los valores de la clave primaria de otra tabla. Para poder añadir una fila con un valor de clave foránea específico, debe existir una fila en la tabla relacionada con el mismo valor de clave primaria.

### Relaciones en base de datos
Las relaciones de bases de datos son asociaciones entre tablas que se crean utilizando sentencias de unión para recuperar datos.

- Unívoca: Las dos tablas pueden tener sólo un registro en cada lado de la relación. Cada valor de clave primaria se relaciona con sólo un (o ningún) registro en la tabla relacionada. 
La mayoría de relaciones unívocas están impuestas por las reglas empresariales y no fluyen con naturalidad a partir de los datos. Sin este tipo de regla, generalmente podrá combinar ambas tablas sin incumplir ninguna regla de normalización. Ej.: DNI y ID de cliente

- Uno a varios: La tabla de claves primaria sólo contiene un registro que se relaciona con ninguno, uno o varios registros en la tabla relacionada. Ej.: tabla provincia y tabla pueblo

- Varios a varios: Cada registro en ambas tablas puede estar relacionado con varios registros (o con ninguno) en la otra tabla. Estas relaciones requieren una tercera tabla, denominada tabla de enlace o asociación, porque los sistemas relacionales no pueden alojar directamente la relación. Ej.: Coche, Persona (con coche favorito), Viaje y Personas que van dentro del coche.


## ¿Qué es SQL?

Lenguaje que permite expresar operaciones diversas (aritméticas, lógicas, combinatorias) con datos almacenados en Bases de Datos Relacionales.
- La información almacenada en este tipo de Bases de Datos, esta contenida en “estructuras”.
- Estas estructuras se las denominan TABLAS.
- En las TABLAS la información esta dispuesta en filas y columnas.

- La tendencia generalizada de su uso por la industria a llevado a su estandarización por:
    – ANSI Instituto Norteamericano de Normas
    – ISO Organización Internacional de Estándares.
- Los productos concretos no tienen porque seguir estasespecificaciones.
- Los productos pueden aportar características particulares y ampliaciones y extensiones que pueden ofrecer:
Oracle, Postgre, MySQL, DB2...

## ¿Cómo se usa?
Se realizan peticiones sobre los datos, mediante sentencias SQL. Siguiendo sus reglas sintácticas y semánticas.
- Estas sentencias se pueden ejecutar:
    – Desde un terminal por un usuario.
    – Escribiendo sentencias SQL embebidas en el código de programas.


## ¿Para qué sirve el SQL?

- DML: (Data Manipulation Language)
    – Permiten realizar consultas y movimientos de datos. (SELECT,
INSERT, UPDATE, DELETE).
- DDL: (Data Definition Language)
    – Permiten definir nuevos objetos o destruirlos. (CREATE, DROP)
    – Añaden o borran información al catálogo.
- DCL: (Data Control Language)
    – Control de acceso a datos y seguridad. (GRANT, REVOKE)


## Tipos de datos

Los tipos de datos regularmente son organizados en las siguientes categorías:
- Numéricos exactos.
- Cadenas de caracteres Unicode.
- Valores numéricos aproximados.
- binarios o blobs.
- Fecha y hora.
- Otros tipos de datos.

Cada tipo de dato puede ser usado en una o muchas situaciones así que seleccionar el adecuado dependerá del desarrollador encargado, por lo regular algunos de los más utilizados son varchar, int y datetime pero no podemos descartar la posibilidad de que algún otro sea mejor según cada caso particular.

