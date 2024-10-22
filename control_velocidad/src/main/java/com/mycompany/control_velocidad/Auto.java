/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control_velocidad;

/**
 *
 * @author Clemente
 */
public class Auto {
    
    public String patente;
    public double velocidad;
    
    public Auto(String patente,double velocidad) {
        this.patente=patente;
        this.velocidad=velocidad;
    }
     
    @Override
    public String toString() {
        return " Patente = "+patente+", Velocidad = "+velocidad;
    }
    
}
