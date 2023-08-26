#!/bin/bash

first_arg=false

for arg in $@
do
  if [ $first_arg = "false" ]; then
    first_arg="true"
  else
    echo "copiando de $1 a $arg"
		cp -R "$1" "$arg"
	fi
done
