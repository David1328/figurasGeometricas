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

    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return ((this.base * this.altura) / 2);
    }

    @Override
    public String imprimir() {
        if (base > 0 && altura > 0) {
            return "La base del triangulo es: " + this.base + "\nLa altura del triangulo es: " + this.altura + " \nEl area del triangulo es: " + this.area();
        } else {
            return "Numeros no validos";
        }    
    }

    @Override
    public void perdirDatos() {
        System.out.println("Ingrese la base del triangulo");
        this.base = entrada.nextFloat();
        System.out.println("\nIngrese la altura del triangulo");
        this.altura = entrada.nextFloat();
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
