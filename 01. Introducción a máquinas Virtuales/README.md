Venid el primer día con la máquina virtual instalada, o por lo menos habiéndolo intentado!


# Maquina virtual
Máquina virtual o virtual machine (VM) es una emulación de un sistema de computación. 

## Máquinas virtuales de sistema
Las máquinas virtuales de sistema, también llamadas máquinas virtuales de hardware, permiten a la máquina física subyacente multiplicarse entre varias máquinas virtuales, cada una ejecutando su propio sistema operativo.
A la capa de software que permite la virtualización se la llama hipervisor.
Un hipervisor puede ejecutarse o bien directamente sobre el hardware (tipo 1) o bien sobre un sistema operativo (tipo 2).

El overhead que introducen los hipervisor modernos está entre 9-12% de CPU.

## Aplicaciones
- Virtualbox
- Vmware
- Hyper-V (opción Windows)

![alt text](https://raw.githubusercontent.com/AgustinICAI/CursoCeroMBD/master/images/virtualizacionArchitecture.png)


## Otros tipos de virtualizaciones
Existen virtualizaciones como máquina virtual de aplicación o la contenerización, que no se van a ver en este curso cero.


# Para realizar en casa

## OPCION 1 (La que haremos en clase y se recomienda para el MBD por su facilidad de volver a recrearse)

### 1. Instalar VirtualBox Windows y MAC
https://www.virtualbox.org/wiki/Downloads

### 2. Descargar imagen Ubuntu
https://ubuntu.com/download/desktop/thank-you?version=22.04.3&architecture=amd64
- Se descargará una ISO que es la que hay que cargar en virtualbox

- Here's what Canonical lists as the recommended minimum system requirements for installing the desktop edition of Ubuntu 20.04 Focal Fossa (source). Keep in mind that this pertains to physical installs. Virtualized installs can actually get by with less.
    - 2 GHz dual core processor
    - 4 GiB RAM (system memory)
    - 25 GB of hard drive space (or USB stick, memory card or external drive but see LiveCD for an alternative approach)
    - VGA capable of 1024x768 screen resolution

* Puede darse el problema de que a nivel de bios no esté habilitada la opción de hypervisor. Si da un error al instalar será necesario activarlo en bios.

- Instalar en virtual Box
- Activar la funcionalidad de copypaste y drag&drop. No todos los sistemas son compatibles con esta funcionalidad. También es recomendable configurar una shared folder.

## OPCION 2 (Sólo para los que tengáis un WINDOWS y licencia PRO)

Esta forma sería la más nativa, ya que no hace falta instalar un programa de 3ros para realizar la virtualización. El propio sistema operativo Windows ya tiene instalado hyper-v que interacciona con el hipervisor de la máquina.

![Instalación Ubuntu usando hyper-V de Windows PRO](https://wiki.ubuntu.com/Hyper-V)

## OPCION 3

### 1. Crear una partición en el disco (para no borrar el que ya tenemos, en windows se puede usar el gestor de particiones)
### 2. Instalar ubuntu en ella. Para ello será necesario crear un usb bootable con el ubuntu dentro.

