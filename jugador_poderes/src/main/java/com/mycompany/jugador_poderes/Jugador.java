
package com.mycompany.jugador_poderes;

/**
 *
 * @author crist
 */
public class Jugador {
    public String nombre;
    public float nivelVida;
    public Poder[] poderes;
    
    public Jugador (String nombre, int maximo){
        this.nombre = nombre;
        this.nivelVida = 100;
        this.poderes = new Poder [maximo];
    }
    
    @Override
    public String toString(){
        return "[" + this.nombre + " tiene " + this.nivelVida + " vida"
                + " y puede tener hasta " + this.poderes.length +" poderes";
    }
    
    
    @Override
    public boolean equals (Object otro){
        if (otro instanceof Jugador j){
            return this.nombre.equalsIgnoreCase(j.nombre);
        }
        return false;
    }
    public boolean agregarPoder (Poder nuevo){
        int ubicacion = 0;
        for (Poder p : this.poderes)
            if (p == null){
                this.poderes[ubicacion]=nuevo;
                        return true;
            }
            else{
                ubicacion+=1;
            }
        return false;
    }
    public boolean reemplaza (Poder p, int ubicacion){
        if (ubicacion <=0 || ubicacion > this.poderes.length){
            return false;
        }
        if (this.poderes[ubicacion-1] == null){
            this.poderes[ubicacion-1] = p;
                return true;
    }
        return false;
    }
}
