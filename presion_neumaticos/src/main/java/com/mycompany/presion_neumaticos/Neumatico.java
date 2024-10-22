/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presion_neumaticos;

/**
 *
 * @author Clemente
 * Se desea un sistema que cuando la presión de alguna neumático esté por 
 * debajo de 25  muestra un mensaje de presión baja, si está entre 25 y 30, 
 * mostrar un mensaje que diga que el neumático pierde algo de presión y }
 * si está por encima de 30 no diga nada. Simular que un auto pierde 
 * presión en una ocasión y baja hasta 24, otra ocasión se pone en 27 
 * (recordar que la modificación de valores de atributos se  debe hacer a
 * través de los métodos) 
 */
public class Neumatico {
    
    public int id;
    public int presion;
    
    public Neumatico(int id) {
        this.id=id;
        presion=35;
    }
    
    public void desinflar(int cantidad) {
        presion=cantidad;
    }
    
    public void pinchazo() {
        presion=0;
    }
    
    @Override
    public String toString() {
        if ( presion < 25 )
            return " Neumático ["+id+"] con presión baja";
        else {
            if ( presion >= 25 && presion <= 30 ) 
                return " Neumático ["+id+"] con perdida de presión";
            else  
                return " Neumático ["+id+"] con presión normal";
        }
    }
}
