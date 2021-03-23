/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Santigo Bernal
 * @author David Quintero
 * @version 1.0.0
 */
public class Rectangulo extends FigurasGeometricas {

    //variable de base para emplear en la clase
    private float base;
    //variable de altura para emplear en la clase
    private float altura;

    //realiza la operacion para hallar el area
    @Override
    public float area() {
        return (this.base * this.altura);
    }

    //muestra los resultados de las operaciones ya realizadas, es decir el area calculada
    @Override
    public String imprimir() {
        if (base > 0 && altura > 0) {
            return "La base del rectangulo es: " + this.base + "\nLa altura del rectangulo es: " + this.altura + "\nEl area del rectangulo es: " + this.area();
        } else {
            return "Numeros no validos";
        }
    }

    //pide los datos para utilizarse en la clase
    @Override
    public void perdirDatos() {
        System.out.println("Ingrese la base del rectangulo");
        this.base = entrada.nextFloat();
        System.out.println("\nIngrese el altura del rectangulo");
        this.altura = entrada.nextFloat();
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
