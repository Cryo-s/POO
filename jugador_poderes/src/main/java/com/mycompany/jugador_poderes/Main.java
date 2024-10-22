
package com.mycompany.jugador_poderes;

/**
 *
 * @author crist
 */
public class Main {
    public static void main(String[] args) {
        // Crea objetos que representan poderes
        Poder px = new Poder();
        Poder py = new Poder();
        //Setea el estado del objeto
        px.nombre = "Rayo Laser";
        px.potenciaDestruccion = 0.6f;
        //Imprime el objeto
        System.out.println(px);
        
        py.nombre = "Congelamiento instantaneto";
        py.potenciaDestruccion = 0.7f;
        //Imprime el objeto
        System.out.println(py);
        //Crea el objeto que representa al jugador
        Jugador jx = new Jugador ("SuperTron",4);
          //Imprime el objeto
        System.out.println(jx);
       
        
        //Le asigna un poder
        System.out.println(jx.agregarPoder(px));
        System.out.println(jx.poderes[0]);
      
        
        System.out.println(jx.reemplaza(py,1));
            
    }

}
