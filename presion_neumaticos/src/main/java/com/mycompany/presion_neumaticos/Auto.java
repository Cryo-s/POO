/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presion_neumaticos;

import java.util.Arrays;

/**
 *
 * @author Clemente
 * 

 */
public class Auto {
    
    public String patente;
    public Neumatico[] neumaticos;
    
    public Auto(String patente) {
        this.patente=patente;
        neumaticos=new Neumatico[4];
        for(int i=0; i < neumaticos.length; i++)
            neumaticos[i]=new Neumatico(i);
    }
    
    public void colision(int i, int k) {
        System.out.println(" ---- se ha colisión en neumático "+i+" ---- se ha perdido "+k+" \n");
        neumaticos[i].desinflar(k);
    }
    
    public void pinchazo(int i) {
        System.out.println(" ---- se ha producido un pinchazo en neumático "+i+" ----\n");
        neumaticos[i].pinchazo();
        if ( neumaticos[i].presion==0) {
            neumaticos[i]=new Neumatico(i);
            System.out.println(" ---- neumático cambiado ----\n");
        }
    }
    
    @Override
    public String toString() {
        return Arrays.toString(neumaticos);
    }
    
}
