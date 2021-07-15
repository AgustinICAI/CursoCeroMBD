# Pilares de la POO

## Abstracción
La **abstracción** es un proceso en el que muestra solo datos "relevantes" y se "ocultan" al usuario detalles innecesarios de un objeto.

Ej.: Cuando te logas en tu cuenta de Carrefour, introduces "email" y "contraseña", y posteriormente presionas login. Lo que pasa cuando presionas login, o como la información es enviada a los servidores de Carrefour, y como se verifica tu cuenta, es todo abstraído al usuario.


## Encapsulamiento

El encapsulamiento es:
- Vincular los datos con el código que los manipula. 
- Mantener los datos y el código a salvo de interferencias externas.

El código encapsulado por tanto tiene que tener las siguientes características:
- Todos saben cómo acceder 
- Se puede acceder fácilmente independientemente de los detalles de implementación.
- Modificar el código, no debería tener ningún efecto secundario en el resto de la aplicación.

** La idea de la encapsulación es mantener los objetos separados y evitar que existan grandes dependencias entre sí. **

## Herencia

La herencia es el mecanismo por el cual un objeto adquiere algunas / todas las propiedades de un objeto padre.

## Polimorfismo

Polimorfismo significa procesar objetos de manera diferente según su tipo de datos. Consiste en que un método tiene una implementación múltiple dependiendo de la clase en la que se ejecuta o los argumentos que se le pasen.

** Sobrecarga ** significa que más de un método tiene el mismo nombre de método pero se comporta de manera diferente en función de los argumentos pasados ​​al llamar al método.

** Sobreescritura ** significa que una clase heredada sobreesribe un método de su super-clase o clase padre.