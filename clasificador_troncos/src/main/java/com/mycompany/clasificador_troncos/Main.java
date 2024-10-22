/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasificador_troncos;

/**
 *
 * @author Clemente
 */
public class Main {

    public static void main(String[] args) {
       
        Tronco tronco1=new Tronco(0,100);
        Tronco tronco2=new Tronco(1,100);
        Tronco tronco3=new Tronco(2,151);
        Tronco tronco4=new Tronco(3,25);
        Tronco tronco5=new Tronco(4,100);
        Tronco tronco6=new Tronco(5,10);
        Tronco tronco7=new Tronco(6,100);
        Tronco tronco8=new Tronco(7,15);
        Tronco tronco9=new Tronco(8,15);
        Tronco tronco10=new Tronco(9,10);
        
        Clasificador c=new Clasificador(5);
        
        c.ponerTronco(tronco1);
        c.ponerTronco(tronco2);
        c.ponerTronco(tronco3);
        c.ponerTronco(tronco4);
        c.ponerTronco(tronco5);
        c.ponerTronco(tronco6);
        c.ponerTronco(tronco7);
        c.ponerTronco(tronco8);
        c.ponerTronco(tronco9);
        c.ponerTronco(tronco10);
        
        System.out.println(c.toString());
        System.out.println(" El tipo más frecuente es: "+tipoMasFrecuente(c.indice_cortos,c.indice_medianos,c.indice_largos));
    }
    
    public static String tipoMasFrecuente(int numero_cortos, int numero_medianos, int numero_largos) {
        String mas_frecuente="corto";
        int maximo=numero_cortos;
        if ( maximo < numero_medianos ) 
            mas_frecuente="mediano";
        else {
            if ( maximo < numero_largos )
                mas_frecuente="largo";
        }
        return mas_frecuente;
    }
    
    
}
