/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.presion_neumaticos;

/**
 *
 * @author Clemente
 */
public class Main {

    public static void main(String[] args) {
        Auto auto1=new Auto("LGHJ-87");
        
        System.out.println(auto1.toString());
        
        auto1.colision(0, 27);
        
        System.out.println(auto1.toString());
    
        auto1.colision(2, 24);
        
        System.out.println(auto1.toString());
        
        auto1.pinchazo(0);
        
        System.out.println(auto1.toString());
    }
}
