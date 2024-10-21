/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torneo;

/**
 *
 * @author Jazna
 */
public class Combate {
    public Jugador oponente_uno, oponente_dos;
    

    public Combate(Jugador uno, Jugador dos) {
        this.oponente_uno = uno; this.oponente_dos = dos;
    }
    
    /**
     * Determina si hay un triunfador en el combate
     * @return true en caso de que exista un trounfador false en caso contrario
     */
    public boolean hayTriunfador(){
        return this.oponente_uno.estaVivo() || this.oponente_dos.estaVivo();
    }

    /**
     * Inicia el ataque, es decir, el oponente uno araca al oponente dos y luego el oponente 2 ataca al oponente uno.
     * El triunfador, en caso de empate, será el oponente uno
     * @return jugador ganador del combate o null en el caso de que no haya ganador
     */
    public Jugador generaAtaque() {
        Jugador triunfador;
        this.oponente_uno.ataque(this.oponente_dos);
        this.oponente_dos.ataque(this.oponente_uno);
        if (!this.hayTriunfador()) {
            return null;
        }
        triunfador = (this.oponente_uno.nivelVida >= this.oponente_dos.nivelVida) ? this.oponente_uno : this.oponente_dos;
        return triunfador;
    }


    @Override
    public String toString() {
        return "Combate:\n\t" + this.oponente_uno + "\n\tcontra\n\t" + this.oponente_dos;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Combate c){
            return this.oponente_uno.equals(c.oponente_uno) && this.oponente_dos.equals(c.oponente_dos);
        }
        return false;
    }
}
