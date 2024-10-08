
package com.mycompany.presion_neumaticos;

/**
 *
 * @author crist
 */
public class Main {
    public static void main(String[] args) {
     //Crear neumaticos iniciales para el auto
     Neumatico[] neumaticos = {
         new Neumatico("001","Michelin",32),
         new Neumatico("002", "Pirelli", 32),
         new Neumatico("003", "Goodyear", 32),
         new Neumatico("004", "Bridgestone", 32)
     };
    
     //Crear el auto con la patente y los neumaticos
     Auto auto = new Auto ("ABC123",neumaticos);
     
     //Simular colisiones que hacen bajar la presion de los neumaticos
     auto.colision(0,8); //Baja a 24, deberia mostar "Presion baja"
     auto.colision(1,5); //Baja a 27, deberia mostrar "El neumatico esta perdiendo presion"
    
    //Simular pinchazo en el neumatico 2
    neumaticos[2].setPresionActual(0);
    System.out.println("Simulando pinchazo en el neumático 2.");
        
        //Cambiar el neumatico pinchado
        Neumatico nuevoNeumatico = new Neumatico ("005","continental",32);
        auto.cambiuarNeumatico(2, nuevoNeumatico);
        
     //Imprimir el estado final del auto y los neumaticos
        System.out.println(auto);
        
    }
}
