/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Santigo Bernal
 * @author David Quintero
 * @version 1.0.0
 */
public abstract class FigurasGeometricas {

    //Se crea la variable que se puede tener en común con las demas clases
    private String color;
    //Se crean los metodos que se van a implemetar en las demas clases
    public abstract float area();
    public abstract String imprimir();
    public abstract void perdirDatos();
    public static Scanner entrada = new Scanner(System.in);
    
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }    
}
