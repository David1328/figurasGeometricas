/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author asantibo
 */
public class Triangulo extends FigurasGeometricas {

    //variable de base para emplear en la clase
    private float base;
    //variable de altura para emplear en la clase
    private float altura;

    public Triangulo() {
    }

    //contrulle la clase.. 
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //realiza la operacion para hallar el area
    @Override
    public float area() {
        return ((this.getBase() * this.getAltura()) / 2);
    }

    //muestra los resultados de las operaciones ya realizadas, es decir el area calculada
    @Override
    public String imprimir() {
        if (getBase() > 0 && getAltura() > 0) {
            return "La base del triangulo es: " + this.getBase() + "\nLa altura del triangulo es: " + this.getAltura() + " \nEl area del triangulo es: " + this.area();
        } else {
            return "Numeros no validos";
        }    
    }

    //pide los datos para utilizarse en la clase
    @Override
    public void perdirDatos() {
        System.out.println("Ingrese la base del triangulo");
        this.setBase(entrada.nextFloat());
        System.out.println("\nIngrese la altura del triangulo");
        this.setAltura(entrada.nextFloat());
    }
    
    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
