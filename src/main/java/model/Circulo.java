/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author asantibo
 */
public class Circulo extends FigurasGeometricas{

    private final double pi = Math.PI;
    private float radio;
    
    @Override
    public float area() {
        return ((float)this.pi*this.radio);
    }

    @Override
    public String imprimir() {
        return "El radio del circulo es: "+this.radio+"\nEl area del circulo es: "+this.area();
    }  
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

}
