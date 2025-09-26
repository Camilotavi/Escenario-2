# Escenario-2

## Punto 1.

Problema del escanerio es que se incluyen varias formas de notificaciones y para cada una varios tipos. Este genera una gran cantidad de objetos necesarios para manejar cada posible combinación entre plataforma de notificacion y tipos. Aunque se esta hablando directamente sobre la creación de objetos no es de tipo creacional, debido a que la creación de objetos no es compleja como tal, al final cada notificación tiene dos variables, la plataforma y el tipo. El problema esta en como relacionar clases y objetos para evitar la gran combinación de subclases posibles, es decir, defnir como se conectan las piezas del sistema para generar los tipos de notificaciones.

## Punto 2.

El patrón en especifico que soluciona este problema es Bridge. Este patrón de diseño directamente permite combinar libremente varias dimensiones de un objeto sin necesidad de crear subclases para cada posible combinación. Se relaciona perfecto con el ejemplo en Refractoring Guru, donde el problema es que hay una clase "forma" (notificación) con dos subclases que son circulo y cuadrado (las plataformas) y para cada una hay dos posibles colores (los tipos de notificación).

Con dimensiones más complejas el numero de subclases crece exponencialmente lo que afecta la flexibilidad y la escalabilidad.

## Punto 3.

<img width="945" height="632" alt="DBMS ER diagram (UML notation) (1)" src="https://github.com/user-attachments/assets/03e77bd9-00de-4056-8c7c-10edcf0fe10d" />

Acá se ve como se separan las dos dimensiones de las notificaciones (plataforma y tipo). Notificion es la abstraccion del patron porque es lo que define el “qué quiere hacer el sistema” (mostrar mensaje, alerta, etc.). Y la plataforma es la implementacion porque define el “cómo se hace en cada caso técnico”. La notificacion es el componente de alto nivel con el que interactua el cliente y eso se lo delega a la plataforma para que lo muestre, por eso la plataforma es de bajo nivel. Ambos de forma independiente tiene subclases.

Notificacion es clase abstracta porque hereda comportamiento a las subclases (enviarNotificacion) pero no impone el cómo, cada una decide el comportamiento que hace (mensaje, alerta, advertencia...). Y plataforma es interfaz porque, hereda a las subclases, y ademas, tambien define el comportamiento que todas deben cumplir si o si (aunque tampoco imponga el como) que es mostrarContenido. En este caso Notificacion tambien puede ser interfaz.

## Funcionamiento

Definimos las plataformas donde ban las notificaciones

<img width="762" height="292" alt="image" src="https://github.com/user-attachments/assets/dded8cf8-c23a-4419-a317-8c2ea884bf9e" />

Dentro de cada una podemos crear facilmente con todos los tipos sin necesidad de multiples subclases, que viene siendo el problema principal del escenario

<img width="839" height="450" alt="image" src="https://github.com/user-attachments/assets/a3c6743d-450a-4cc1-8811-9cdc6001e544" />

Acá lo mismo con otra plataforma

<img width="851" height="445" alt="image" src="https://github.com/user-attachments/assets/90eda3fc-6f32-4273-8f77-063c792d5f5f" />

Y finalmente el resultado con varias notificaciones

<img width="551" height="459" alt="image" src="https://github.com/user-attachments/assets/ae7a7b4e-2d50-4e83-a4ba-3cd3ef9f79eb" />







