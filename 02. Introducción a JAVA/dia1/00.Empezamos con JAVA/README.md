## Origen JAVA
- Origen
- Necesidades que cubría: multiplataforma|POO|Garbage Collector
<p align="left">
  <img src="https://cdn.wrytin.com/images/wrytup/r/1024/greenbbq-jz48l38k.jpeg" width="700">
</p>

## Principal uso de java a día de hoy
- Aplicaciones escritorio (Java SE), aplicaciones web (Java EE) / servidor de aplicaciones (Java SE) / Microservicios (Springboot - Java SE), Movil (Android - Java SE)

## Comparación con otros lenguajes
[TIOBE](https://www.tiobe.com/tiobe-index/)

## JVM
- código java, bytecode y JVM

## Instalación en local del jdk e IDE
Importancia del licenciamiento:  Software comercial - Trial, Software gratuito, software opensource

Instalar Java SE - Openjdk (java y javac)
[JAVA openjdk 15](https://jdk.java.net/java-se-ri/15)

Actualizar el PATH de tu máquina para incluir ./bin
[Modificacion Path](https://www.java.com/en/download/help/path.xml)

## JDK vs JRE

## Concepto clase, interfaz y mensaje


# INSTARLAR JAVA EN UBUNTU
1) sudo apt install openjdk-16-jdk-headless
1') Probar que java --version devuelve la version 16 que acabamos de instalar.
1'') si esto no es así:
1''a) Sí dice comando no encontrado, significa que no se ha instalado bien y ubuntu no sabe donde está instalado java, por lo que habrá que actualizar en /usr/bin lo indicado en el aparcado 3
1''b) Si devuelve otra versión, significa que tenemos que cambiar las rutas relativas de nuestro equipo.
2) Ver que hay configurado en /usr/bin/ y actualizarlo a lo último descargado 
- Aqui veo, que java es un link y apunta a /etc/alternatives/java
- Voy a modificar /etc/alternatives/java para que apunte al nuevo java
* Estaba en /usr/lib/jvm/jdk-15.0.2/bin/java
* Lo voy al nuevo java /usr/lib/jvm/java-16-openjdk-amd64/bin/java

3)
```
sudo ln -s /usr/lib/jvm/java-16-openjdk-amd64/bin/java java
sudo ln -s /usr/lib/jvm/java-16-openjdk-amd64/bin/javac javac
```
Hay que hacerlo tanto para java, como para javac