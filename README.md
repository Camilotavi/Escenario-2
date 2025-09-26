# Escenario-2

## Punto 1.

Problema del escanerio es que se incluyen varias formas de notificaciones y para cada una varios tipos. Este genera una gran cantidad de objetos necesarios para manejar cada posible combinación entre plataforma de notificacion y tipos. Aunque se esta hablando directamente sobre la creación de objetos no es de tipo creacional, debido a que la creación de objetos no es compleja como tal, al final cada notificación tiene dos variables, la plataforma y el tipo. El problema esta en como relacionar clases y objetos para evitar la gran combinación de subclases posibles, es decir, defnir como se conectan las piezas del sistema para generar los tipos de notificaciones.

## Punto 2.

El patrón en especifico que soluciona este problema es Bridge. Este patrón de diseño directamente permite combinar libremente varias dimensiones de un objeto sin necesidad de crear subclases para cada posible combinación. Se relaciona perfecto con el ejemplo en Refractoring Guru, donde el problema es que hay una clase "forma" (notificación) con dos subclases que son circulo y cuadrado (las plataformas) y para cada una hay dos posibles colores (los tipos de notificación).

Con dimensiones más complejas el numero de subclases crece exponencialmente lo que afecta la flexibilidad y la escalabilidad.

## Punto 3.

