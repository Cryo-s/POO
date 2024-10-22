/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificador_troncos;

/**
 *
 * @author Clemente
 * Un tronco tiene un identificador, un largo, un ancho, un alto y un peso.
Hay tres tipos: cortos (si es más largo de 150 cm, medianos si está entre 50 cm-150 cm y cortos si
es menor que 50 cm)
 */
public class Tronco {
    public int id;
    public double largo;
    public String tipo;
    
    public Tronco(int id, double largo) {
        this.id=id;
        this.largo=largo;
        if ( largo > 150.0 ) tipo="largo";
        else {
            if ( largo >= 50.0 && largo <= 150.0 ) tipo="mediano";
            else tipo="corto";
        }
    }
    
    @Override
    public String toString() {
        return " Id = "+id+" tipo = "+tipo;
    }
}
