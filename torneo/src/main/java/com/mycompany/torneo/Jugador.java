

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.torneo;
/**
 *
 * @author Jazna
 */
public class Jugador {
    public String nombre;
    public int nivelVida;
    public Arma arma;

    public Jugador(String nombre, Arma arma) {
        this.nombre = nombre;
        this.nivelVida = 100;
        this.arma = arma;
    }

    /**
     * Método para atacar a otro jugador      
     * @param oponente jugador que será atacado
     * @return indicador lógico para saber si el ataque fue crítico
     */
    public boolean ataque(Jugador oponente) {
        int damage = this.arma.damage;
        boolean critical = this.arma.esCritica();
        
        if (critical) {
            damage *= 2;
        }
        oponente.takeDamage(damage);
        return critical;
    }
    
    /**
     * Método para recibir daño y descontar del nivel de vida
     * @param damage puntos de daño que serán descontados del nivel de vida del jugador
     */
    public void takeDamage(int damage) {
        this.nivelVida -= damage;
        if (this.nivelVida < 0) {
            this.nivelVida = 0;
        }
    }
        
    /**
     * Retorna un indicador para saber si el jugador está vivo
     * @return true en caso de que el ugador tenga vida
     */
    public boolean estaVivo(){
        return this.nivelVida > 0;
    }

    @Override
    public String toString() {
        return "Jugador: " + this.nombre + ", Vida: " + this.nivelVida + ", Arma: " + this.arma;
    }
    
    @Override
    public boolean equals(Object otro){
        if (otro instanceof Jugador j){
            return this.nombre.equalsIgnoreCase(j.nombre) && this.nivelVida == j.nivelVida && this.arma.equals(j.arma);
        }
        return false;
    }
}

