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
public class Rectangulo extends FigurasGeometricas{

    private float base;
    private float altura;

    @Override
    public float area() {
        return (this.base * this.altura);
    }
    
    @Override
    public String imprimir(){
        return "La base del rectangulo es: "+this.base+"\nLa altura del rectangulo es: "+this.altura+"\nEl area del rectangulo es: "+this.area();
    } 
    
    @Override
    public void perdirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
