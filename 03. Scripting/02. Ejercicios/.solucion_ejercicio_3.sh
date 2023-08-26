#!/bin/bash

ficheros=$(ls $1)

for FILE in $ficheros
do
	if [ -f $1/$FILE ]; then
		echo "$FILE -> es un fichero"
	fi
	if [ -d $1/$FILE ]; then
		echo "$FILE -> es un directorio"
	fi
done
