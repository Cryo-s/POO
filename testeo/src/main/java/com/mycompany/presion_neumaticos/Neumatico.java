
package com.mycompany.presion_neumaticos;

/**
 *Aplicación java para sistema inteligente presión de neumáticos: 
 * Nos han pedido crear una aplicacion en java que permita conocer el
 * estado de la presion de un neumatico, lo que desea un sistema que cuando la presion de 
 * algun neumatico este por debajo de 25 muestra un mensaje que diga presion baja, si esta entre 25 y 30 
 * mostrar un mensaje que diga que el neumatico pierde algo de precion y si esta por encima de 30 no diga 
 * nada, Simular que un auto pierde presion en una ocasion y baja hasta 24, otra que baja hasta 27,(Recordar 
 * que la modificacion de valores de atributos se debe hacer a través de los metodos). 
 * Se pide un proyecto en netbeans cuyo nombre sea presion_neumaticos y que tenga los siguientes requisitos: 
 * -Clase neumatico.java (identificador, marca y presionActual) - Clase auto.java (patente, Array de neumaticos) 
 * -Clase main.java (contiene el metodo main) -Implementacion completa de cada una de las clases con atributos, 
 * constructor,mmetodo toString, equals - Creacion en la clase main de un objeto del tipo auto y del metodo colisión 
 * en neumatico i que lo que haves es restar una cierta cantidad k al neumático i: colision(int i, double perdida_presion) -
 * implementar el metodo cambiarNeumatico 
 * (neumatico nuevo) que lo que hace es cambiar un neumatico usado a otro nuevo cuando su presion es cero, simular para ello un pinchazo en el main. 
 * 
 * 
 * 
 */
public class Neumatico {
    private String identificador; //Identificador unico del neumatico
    private String marca; //Marca del neumatico
    private double presionActual; //Presion actual del neumatico
    
    //Constructor de la clase neumatico
    public Neumatico (String identificador, String marca, double presionActual){
        this.identificador = identificador;
        this.marca = marca;
        this.presionActual = presionActual;
    }
    
    //Getter para obtener la presion del neumatico
    public double getPresionActual(){
        return presionActual;
    }
    
    //Setter para actualizar la presión del neumático
    public void setPresionActual (double presionActual){
        this.presionActual = presionActual;
    }
    
    //Metodo toString para que se imrpima en pantalla objeto neumatico
    
    @Override
    public String toString(){
        return "Neumatico = \n" +"Identificador = "+identificador + "\n" +", "
                + "marca = " + marca + "\n" +
                ", presionActual =" + presionActual;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Neumatico neumatico = (Neumatico) o;
        
        if (Double.compare(neumatico.presionActual, presionActual) != 0) return false;
        if (!identificador.equals(neumatico.identificador)) return false;
        return marca.equals(neumatico.marca);
    }
    
    //Metodo que verifica si la presión esta baja
    public String verificarPresion(){
        if (presionActual <25){
            return "Presion baja";
        }else if (presionActual >=25 && presionActual <=30){
            return "El neumatico esta perdiendo presion";
        }
        return "presion normal";
    }
}
