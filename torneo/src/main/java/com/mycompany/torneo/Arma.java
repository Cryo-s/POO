/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torneo;

/**
 *
 * @author Jazna
 */
public class Arma {
    public String type;
    public int damage;

    public Arma(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    /**
     * Determina si el arma es crítica
     * Un arma se define como crítica cuando es una espada o cuando sus puntos de daño es superior a 50
     * @return true si es espada o su nivel de daño es superior a 50, false en caso contrario
     */
    public boolean esCritica(){
        return this.type.equalsIgnoreCase("Espada") || this.damage > 50;
    }
    
    @Override
    public String toString(){
        return "{" + this.type + " con " + this.damage + " puntos de daño}";
    }
    
    @Override
    public boolean equals(Object otra){
        if (otra instanceof Arma a){
            return this.type.equalsIgnoreCase(a.type) && this.damage == a.damage;
        }
        return false;
    }
}

