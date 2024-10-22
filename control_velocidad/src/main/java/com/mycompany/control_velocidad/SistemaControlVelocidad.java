/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control_velocidad;

import java.util.Arrays;

/**
 *
 * @author Clemente
 */
public class SistemaControlVelocidad {
    
    public Auto [] autos;
    public final static double VELOCIDAD_MAXIMA=120.0;
    public int contadorInfracciones;
    public double velocidadMinima;
    public double velocidadMaxima;
    
    public SistemaControlVelocidad(int capacidad) {
        contadorInfracciones=0;
        autos=new Auto[capacidad];
        velocidadMinima=-1.0;
        velocidadMaxima=-1.0;
    }
    
    public void computarVelocidadMinimaMaxima() {
        
        if ( autos[0] != null) {
        
           velocidadMinima=autos[0].velocidad;
           velocidadMaxima=autos[0].velocidad;
           
           for(int i=1; i < autos.length; i++) {
               //se podría sacar autos[i]!=null en comun pero lo dejo asi por simplicidad
               if ( autos[i] !=null && autos[i].velocidad < velocidadMinima ) {
                   velocidadMinima=autos[i].velocidad;
               }
               
               if ( autos[i] !=null && autos[i].velocidad > velocidadMaxima ) {
                   velocidadMaxima=autos[i].velocidad;
               }
           }
        
        }
        
    }
    
    public void paso(Auto auto) {
        if ( auto.velocidad > VELOCIDAD_MAXIMA+10.0 ) {
            autos[contadorInfracciones]=auto;
            contadorInfracciones++;
            System.out.println(" El auto con patente "+auto.patente+" cometió exceso de velocidad ");
        }else {
            
            System.out.println(" El auto con patente "+auto.patente+" iba a una velocidad normal ");
        }
        //si llegamos al tope ponemos a cero
        if ( contadorInfracciones == 10 )
            contadorInfracciones=0;
            
    }
    
    @Override
    public String toString() {
        return " Los autos con insfracción son "+Arrays.toString(autos)+"\n"
                + " Velocidad mínima = "+velocidadMinima+" \n "
                + " Velocidad máxima = "+velocidadMaxima+ "\n";
    }
    
}
