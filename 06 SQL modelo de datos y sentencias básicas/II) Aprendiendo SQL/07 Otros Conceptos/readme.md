## OTRAS SENTENCIAS DML
### INSERT https://www.postgresql.org/docs/9.5/sql-insert.html
### DELETE https://www.postgresql.org/docs/9.4/sql-delete.html
### UPDATE https://www.postgresql.org/docs/9.1/sql-update.html

## SENTENCIAS DDL
### CREATE: https://www.postgresql.org/docs/9.1/sql-createtable.html
- PRIMARY KEY
- UNIQUE
- NOT NULL
- REFERENCE, FOREIGN KEY AND DELETE RESTRICTIONS
### ALTER TABLE: https://www.postgresql.org/docs/9.1/sql-altertable.html
### DROP TABLE: https://www.postgresql.org/docs/8.2/sql-droptable.html
- CASCADE vs RESTRICT 


## VISTAS: https://www.postgresql.org/docs/9.2/sql-createview.html
- Una vista es un SELECT compuesto cuya formulación (no su resultado), se almacena en el catálogo dándole un nombre.
- Puesto que el resultado de ejecutar este SELECT será una tabla, nada impide que se puedan especificar consultas sobre ella, para lo cual basta con mencionar su nombre en la cláusula FROM de otra sentencia SELECT
- La diferencia con las tablas es que las vistas no tienen almacenamiento físico asociado.

## VISTAS MATERIALIZADAS - https://www.postgresql.org/docs/9.3/rules-materializedviews.html

## CURSORES Y PAGINACIONES

## PL / SQL
https://www.postgresql.org/docs/9.2/plpgsql-overview.html#PLPGSQL-ADVANTAGES
