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
- WSL

![alt text](https://raw.githubusercontent.com/AgustinICAI/CursoCeroMBD/master/images/virtualizacionArchitecture.png)


## Otros tipos de virtualizaciones
Existen virtualizaciones como máquina virtual de aplicación o la contenerización, que no se van a ver en este curso cero.


# WINDOWS: Instalación máquina virtual a través de WSL

Windows Subsystem for Linux (WSL) es una característica de Windows que permite a los usuarios ejecutar un entorno Linux directamente en Windows, sin necesidad de máquinas virtuales o configuraciones dual-boot

[Documentación Oficial instalación Microsoft](https://learn.microsoft.com/en-us/windows/wsl/install)

### Prerequisitos

You must be running Windows 10 version 2004 and higher (Build 19041 and higher) or Windows 11 to use the commands below. If you are on earlier versions please see the manual install page.

### WSL 2.0 

WSL aunque supone un mayor consumo de recursos corre a nivel de kernel, por lo que simula prácticamente una máquina virtual corriendo en linux.

# MACOS

ya disponéis del terminal de linux del propio MAC.


