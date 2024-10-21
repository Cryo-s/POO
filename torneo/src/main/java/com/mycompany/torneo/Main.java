/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torneo;

/**
 *
 * @author Jazna
 */
public class Main {
    public static void main(String[] args) {
        /* Creación de armas */
        Arma ax = new Arma("Espada", 50);
        Arma ay = new Arma("Hacha", 60);
        Arma az = new Arma("Lanza", 3);
        
        /* Crea objetos de tipo jugador */
        Jugador jx = new Jugador("Subzero", az);
        Jugador jy = new Jugador("Morfeo", ay);
        Jugador jz = new Jugador("Trinity", ax);
        Jugador jw = new Jugador("Neo", az);
                
        /* Imprime el estado de las armas */
        System.out.println(ax);
        System.out.println(ay);
        
        /* Imprime estado de los objetos que presentan los jugadores */
        System.out.println("----------------");
        System.out.println(jx);
        System.out.println(jy);        
        System.out.println(jz);
        /* Crea un torneo que puede contener a lo más 2 combates */        
        Torneo t = new Torneo(2);
        /* Agrega los combates al torneo */
        System.out.println("Agrega torneo 1 " + (t.agregarCombate(new Combate(jx, jy))?"SI":"NO"));
        System.out.println("Agrega torneo 2 " + (t.agregarCombate(new Combate(jz, jw))?"SI":"NO"));
        /* Inicia el torneo */
        t.iniciarTorneo();
        /* Imprime el estado del torneo */
        System.out.println(t);
    }
}

