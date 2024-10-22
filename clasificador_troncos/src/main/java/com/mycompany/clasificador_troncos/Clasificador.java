/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificador_troncos;

import java.util.Arrays;

/**
 *
 * @author Clemente
 */
public class Clasificador {
    
    public Tronco[] cortos;
    public int indice_cortos;
    public Tronco[] medianos;
    public int indice_medianos;
    public Tronco[] largos;
    public int indice_largos;
    public int capacidad;
    
    public Clasificador(int capacidad) {
        this.capacidad=capacidad;
        indice_cortos=0;
        indice_medianos=0;
        indice_largos=0;
        cortos=new Tronco[capacidad];
        medianos=new Tronco[capacidad];
        largos=new Tronco[capacidad];
    }
    
    public void ponerTronco(Tronco t) {
        
        switch ( t.tipo ) {
            
            case "corto" -> {
                cortos[indice_cortos]=t;
                indice_cortos++;
            }
            
            case "mediano" -> {
                
                medianos[indice_medianos]=t;
                indice_medianos++;
            }
            
            case "largo" -> {
                
                largos[indice_largos]=t;
                indice_largos++;
            }
            
        }//switch
        
        if ( indice_cortos > capacidad ) indice_cortos=0;
        if ( indice_medianos > capacidad ) indice_medianos=0;
        if ( indice_largos > capacidad ) indice_largos=0;
        
    }//ponerTronco
    
    @Override
    public String toString() {
        return Arrays.toString(cortos)+" \n "
              +Arrays.toString(medianos)+" \n "
              +Arrays.toString(largos);
    }
    
}
