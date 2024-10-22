Aplicación Java para Sistema Control de Velocidad
Nos han pedido crear una aplicacion en Java que permita conocer los autos que, al pasar por un radar
situado en una autopista, superan la velocidad en 10 o más km/h, siendo 120 la velocidad máxima.
Se pide un proyecto Netbeans cuyo nombre sea control_velocidad y que tenga los siguientes requisitos:
- Clase Auto.java (patente, velocidad a la circula)
- Clase SistemaControlVelocidad.java (Array de Autos que pasan por el sistema y que han incumplido
la velocidad)
- Clase Main.java (contiene el metodo main)
- Implementación completa de cada una de las clases con atributos, constructor, método toString,
equals (1 punto por cada clase, 3 en total).
- Creación en la clase Main de un objeto del tipo Sistema de Control Velocidad y al menos 10 autos
algunos de los cuales deben exceder la velocidad indicada (1 punto)
- Método darMenorMayor() que permita saber cuál es la velocidad mayor y menor de las
infracciones (2 puntos).
Para su corrección las clases deben estar
completas y bien definidas. Además se debe
poder crear objetos


Aplicación Java para Sistema Inteligente Control de
Presión de Neumáticos
Nos han pedido crear una aplicacion en Java que permita conocer el estado de la presión de los neumáticos. Se
desea un sistema que cuando la presión de alguna neumático esté por debajo de 25 muestra un mensaje de presión
baja, si está entre 25 y 30, mostrar un mensaje que diga que el neumático pierde algo de presión y si está por
encima de 30 no diga nada. Simular que un auto pierde presión en una ocasión y baja hasta 24, otra ocasión se pone
en 27 (recordar que la modificación de valores de atributos se debe hacer a través de los métodos)
Se pide un proyecto Netbeans cuyo nombre sea presion_neumaticos y que tenga los siguientes requisitos:
- Clase Neumatico.java (identificador, marca, y presionActual)
- Clase Auto.java (patente, Array de Neumaticos)
- Clase Main.java (contiene el metodo main)
- Implementación completa de cada una de las clases con atributos, constructor, método toString, equals (1
punto por cada clase, 3 en total).
- Creación en la clase Main de un objeto del tipo Auto y del método colisión en neumático i que lo que haces es
restar una cierta cantidad k al neumático i: colision(int i, double perdida_presion) (1 punto)
- Implementar el método cambiarNeumatico(Neumatico nuevo) que lo hace es cambiar un neumático del Auto
cuando su presión es cero. Simular para ello un pinchazo en el main (2 puntos).
Para su corrección las clases deben estar
completas y bien definidas. Además se debe
poder crear objetos


Aplicación Java para implementar un GPS
Nos han pedido crear una aplicación en Java que permita implementar un mini google maps. Sabemos que
existen ciudades y que se agrupan en rutas. Por ejemplo: si tenemos la ciudad 1, la ciudad 2, la ciudad 3,
…ciudad 10; podría tener la ruta 1 formada por (ciudad 1, ciudad 2, ciudad 5, ciudad 10) y la ruta 2 formada
por ( ciudad 2, ciudad 6, ciudad 9)
Se pide un proyecto Netbeans cuyo nombre sea google_maps y que tenga los siguientes requisitos:
- Clase Ciudad.java (con atributos: nombre, número habitantes, extension en km2)
- Clase Ruta.java (con atributos: nombre, Array de Ciudades conectadas entre sí)
- Clase Main.java (contiene el método main)
- Implementación completa de cada una de las clases con atributos, constructor, método toString,
equals (1 punto por cada clase, 3 en total).
- Creación en la clase Main de al menos tres objetos de tipo Ruta que contengan al menos 3 ciudades
(1 punto)
- Método que permita calcular a cuántas rutas pertenece una ciudad, crea una nueva clase si lo ves
necesario (2 puntos).
Para su corrección las clases deben estar
completas y bien definidas. Además se debe
poder crear objetos


Aplicación Java para Clasificador de Troncos de Madera
Nos han pedido crear una aplicacion en Java que permita clasificar los troncos que se echan a los
camiones de la celulosa. Un tronco tiene un identificador y lo que mide de largo. Hay tres tipos:
largos si su largo es mayor de 150 cm, medianos si su largo está entre 50 cm-150 cm y cortos si
es menor que 50 cm.
Se pide un proyecto Netbeans cuyo nombre sea clasificador_troncos y que tenga los siguientes
requisitos:
- Clase Tronco.java (identificador y largo)
- Clase Clasificador.java (Arrays de Troncos en función del largo de los troncos)
- Clase Main.java (contiene el metodo main)
- Implementación completa de cada una de las clases con atributos, constructor, método
toString, equals (1 punto por cada clase, 3 en total).
- Creación en la clase Main de un objeto del tipo Clasificador y al menos 10 troncos algunos de
los cuales deben haber de los diferentes tipos (1.5 puntos)
- Método darTipoMásFrecuente() que permita saber cuál es el tipo más frecuente (1.5
puntos). 
