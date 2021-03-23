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
public class Circulo extends FigurasGeometricas {
    //Se inicializan las variables a usar
    private final double pi = Math.PI;
    private float radio;

    //realiza la operacion para hallar el area
    @Override
    public float area() {
        return ((float) this.pi * this.radio);
    }

    //muestra los resultados de las operaciones ya realizadas, es decir el area calculada
    @Override
    public String imprimir() {
        if (radio > 0) {
            return "El radio del circulo es: " + this.radio + "\nEl area del circulo es: " + this.area();
        } else {
            return "Numeros no validos";
        } 
    }

    //pide los datos para utilizarse en la clase
    @Override
    public void perdirDatos() {
        System.out.println("Ingrese el radio del circulo");
        this.radio = entrada.nextFloat();
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

}
