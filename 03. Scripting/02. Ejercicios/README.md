# 1. Hacer un script que devuelva la siguiente salida haciendo sin usar un bucle

- Ejecución: ./ejercicio "/home/agus"
- Salida: 
```
agus
autoescalado.txt
autoscaler.yaml
...
```

# 2. Hacer un script que devuelva la siguiente salida haciendo usando un bucle

- Ejecución: ./ejercicio "/home/agus"
- Salida: 
```
agus
autoescalado.txt
autoscaler.yaml
...
```

# 3. Hacer un script que devuelva por cada fichero de que tipo es, si fichero o directorio

- Ejecución: ./ejercicio "/home/agus"
- Salida: 
```
agus -> es un directorio
autoescalado.txt -> es un fichero
autoscaler.yaml -> es un fichero
...
```

# 4. Hacer un script que nos haga una copia de seguridad a todas las rutas que le indiquemos después de la primera
- Ejecución: ./ejercicio "/home/agus/backup" "/home/agus/backup1" "/home/agus/backup2" 
- Salida:
```
copiando de /home/agus/backup a /home/agus/backup1
copiando de /home/agus/backup a /home/agus/backup2
```

# 5. El anterior script sobrescribe cada copia de seguridad, es necesario modificarlo para en cada copia de seguridad concatene la fecha y hora del backup
- Ejecución: ./ejercicio "/home/agus/backup" "/home/agus/backup1" "/home/agus/backup2" 
- Salida
```
copiando de backup a backup1
copiando de backup a backup2

#Posteriormente se puede lanzar un tree para comprobar el correcto funcionamiento
➜ tree                                             
.
├── backup
│   └── prueba.txt
├── backup1
│   ├── backup_20230824191149
│   │   └── prueba.txt
│   └── backup_20230824191209
│       └── prueba.txt
├── backup2
│   ├── backup_20230824191149
│   │   └── prueba.txt
│   └── backup_20230824191209
│       └── prueba.txt
└── README.md

7 directories, 6 files
```

```
#!/bin/bash


for i in $(seq 2 $#)
do
  directorio=${!i}
  if [ -d $directorio ]; then
    echo "El directorio '$directorio' ya existe."
  else
    mkdir $directorio
  fi

  for fichero in $1/*
  do
    if [ -f $fichero ]; then
      echo copiando $fichero a $directorio
      cp $fichero $directorio/
    fi
  done

done

```
