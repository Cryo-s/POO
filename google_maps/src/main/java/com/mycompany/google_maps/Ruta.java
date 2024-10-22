/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.google_maps;

import java.util.Arrays;

/**
 *
 * @author Clemente
 */
public class Ruta {
    public int longitudRuta;
    public Ciudad [] ciudades;
    
    public Ruta(int lr) {
        longitudRuta=lr;
        ciudades=new Ciudad[lr];    
    }
    
    public void incluirCiudadEnRuta(int i,Ciudad c) {
        if ( i < longitudRuta ) {
            ciudades[i]=c;
        }
    }
    
    public int contiene(Ciudad c) {
        int contiene=0;
        for(int i=0; i < longitudRuta;i++)
            if ( ciudades[i].equals(c)) //lo hago sin break por simplificar
                contiene=1;
        
        return contiene;
                
    }
    
    @Override
    public String toString() {
        return Arrays.toString(ciudades);
    }
}
