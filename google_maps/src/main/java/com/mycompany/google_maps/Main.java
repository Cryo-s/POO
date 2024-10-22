/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.google_maps;

/**
 *
 * @author Clemente
 */
public class Main {

    public static void main(String[] args) {
         Ciudad[] ciudades=new Ciudad[10];
         for(int i=0; i < 10; i++) 
             ciudades[i]=new Ciudad("Ciudad "+i,1000,60000);
         
         Ruta ruta1=new Ruta(3);
         
         ruta1.incluirCiudadEnRuta(0, ciudades[0]);
         ruta1.incluirCiudadEnRuta(1, ciudades[1]);
         ruta1.incluirCiudadEnRuta(2, ciudades[5]);
         
         System.out.println(ruta1.toString());
         
         Ruta ruta2=new Ruta(3);
         
         ruta2.incluirCiudadEnRuta(0, ciudades[5]);
         ruta2.incluirCiudadEnRuta(1, ciudades[6]);
         ruta2.incluirCiudadEnRuta(2, ciudades[9]);
         
         System.out.println(ruta2.toString());
         
         Ruta ruta3=new Ruta(3);
         
         ruta3.incluirCiudadEnRuta(0, ciudades[2]);
         ruta3.incluirCiudadEnRuta(1, ciudades[6]);
         ruta3.incluirCiudadEnRuta(2, ciudades[8]);
         
         System.out.println(ruta3.toString());
         
         System.out.println(" La ciudad "+ciudades[6]+" aparece en "
                 +vecesEnRutas(ruta1,ruta2,ruta3,ciudades[6])+" rutas ");
         
        
    }
    
    //se podria haber hecho una clase nueva (Mapa que es array de Rutas)
    public static int vecesEnRutas(Ruta r1, Ruta r2, Ruta r3, Ciudad c) {
        return r1.contiene(c)+r2.contiene(c)+r3.contiene(c);
    }
}
