/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torneo;

import java.util.Arrays;

/**
 *
 * @author Jazna
 */
public class Torneo {
    public Combate combates[];
    public int totalCombates;
    public Jugador triunfadores[];
    
    public Torneo(int total){
        this.combates = new Combate[total];
        this.triunfadores = new Jugador[total];
    }
    
    /**
     * Agrega un combate al torneo
     * @param c combate a agregar a la lista de combates del toenro
     * @return true en caso de éxito de la insercaión o false si es que se rechaza la inserción
     */
    public boolean agregarCombate(Combate c){
        if (this.totalCombates < this.combates.length){
            this.combates[this.totalCombates++] = c;
            return true;
        }
        return false;
        
    }
    
    /**
     * Inicia el torneo
     */
    public void iniciarTorneo(){
        for(int i = 0; i < this.totalCombates; i++){
            this.triunfadores[i] = this.combates[i].generaAtaque();                        
        }
    }
    
    @Override
    public String toString(){
        return "Triunfadores de los " + this.totalCombates + " combates:\n" + Arrays.toString(this.triunfadores);
    }
}
