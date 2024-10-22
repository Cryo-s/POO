/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.google_maps;

/**
 *
 * @author Clemente
 */
public class Ciudad {
    
    public String nombre;
    public int numeroHabitantes;
    public double extension;
    
   public Ciudad(String nombre, int numeroHabitantes,double extension) {
       this.nombre=nombre;
       this.numeroHabitantes=numeroHabitantes;
       this.extension=extension;
   }
   
    @Override
   public String toString() {
       return " Nombre = "+nombre+ ", "
             + " Habitantes = "+numeroHabitantes+", "
             + " Extensión = "+extension+" \n";
   }
   
    @Override
   public boolean equals(Object otro_objeto) {
       return nombre.equalsIgnoreCase(((Ciudad)otro_objeto).nombre);
   }
    
    
}
