/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.control_velocidad;

/**
 *
 * @author Clemente
 */
public class Main {

    public static void main(String[] args) {
        SistemaControlVelocidad scv=new SistemaControlVelocidad(10);
        Auto auto1=new Auto("L1",131);
        Auto auto2=new Auto("L2",115);
        Auto auto3=new Auto("L3",132);
        Auto auto4=new Auto("L4",120);
        Auto auto5=new Auto("L5",122);
        Auto auto6=new Auto("L6",136);
        Auto auto7=new Auto("L7",140);
        Auto auto8=new Auto("L8",110);
        Auto auto9=new Auto("L9",100);
        Auto auto10=new Auto("L10",150);
        
        scv.paso(auto1);
        scv.paso(auto2);
        scv.paso(auto3);
        scv.paso(auto4);
        scv.paso(auto5);
        scv.paso(auto6);
        scv.paso(auto7);
        scv.paso(auto8);
        scv.paso(auto9); 
        scv.paso(auto10); 
        
        scv.computarVelocidadMinimaMaxima();
        
        System.out.println(scv.toString());
    }
}
