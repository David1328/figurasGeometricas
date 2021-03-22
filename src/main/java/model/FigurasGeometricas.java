/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author David
 */
public abstract class FigurasGeometricas {
    
    private String color;

    public abstract float area();
    public abstract String imprimir();
    public abstract void perdirDatos();
    public static Scanner entrada = new Scanner(System.in);
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
