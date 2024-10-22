
package com.mycompany.jugador_poderes;

/**
 *
 * @author crist
 */
public class Poder {
    public String nombre;
    public float potenciaDestruccion;
    
    @Override
    public String toString(){
        return "{"+ this.nombre+ " con "+
                this.potenciaDestruccion +
                " Potencia de destruccion}";
    }
    
    @Override 
    public boolean equals (Object otro){
        if (otro instanceof Poder p){
            return this.nombre.equalsIgnoreCase(p.nombre) &&
                    this.potenciaDestruccion == p.potenciaDestruccion;
        }
        return false;
    }

}
