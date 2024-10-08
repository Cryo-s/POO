
package com.mycompany.presion_neumaticos;
import java.util.Arrays;
/**
 *
 * @author crist
 */
public class Auto {
    private String patente; //Patente del auto
    private Neumatico[] neumaticos; //Array que contiene los neumaticos del auto
    
    public Auto(String patente, Neumatico[] neumaticos){
        this.patente = patente;
        this.neumaticos = neumaticos;
    }
    
    //Metodo para realizar una colisiuon que reduce la presion de un neumatico 
    public void colision (int i, double perdida_presion){
        if (i >= 0 && i <neumaticos.length){
            double nuevaPresion = neumaticos[i].getPresionActual() - perdida_presion;
            System.out.println("Neumatico"+i+" Despues de la colision "+neumaticos[i].verificarPresion());
        }else{
            System.out.println("Indice del neumatico fuera de rango.");
        }
    }
    
    //Metodo para cambiar un neumatico si su presion es 0
    public void cambiuarNeumatico (int i, Neumatico nuevo){
        if (neumaticos[i].getPresionActual() == 0){
            neumaticos[i] = nuevo;
            System.out.println("Neumatico cambiado por uno nuevo: "+nuevo);
        }else{
            System.out.println("El neumatico no puede ser cambiado");
        }
    }
    //Metodo toString para obtener informacion sobre el auto y sus neumaticos
    @Override
     public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", neumaticos=" + Arrays.toString(neumaticos) +
                '}';
     }
}
