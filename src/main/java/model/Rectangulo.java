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
public class Rectangulo extends FigurasGeometricas {

    private float base;
    private float altura;

    @Override
    public float area() {
        return (this.base * this.altura);
    }

    @Override
    public String imprimir() {
        if (base > 0 && altura > 0) {
            return "La base del rectangulo es: " + this.base + "\nLa altura del rectangulo es: " + this.altura + "\nEl area del rectangulo es: " + this.area();
        } else {
            return "Numeros no validos";
        }
    }

    @Override
    public void perdirDatos() {
        System.out.println("Ingrese la base del rectangulo");
        this.base = entrada.nextFloat();
        System.out.println("\nIngrese el altura del rectangulo");
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
