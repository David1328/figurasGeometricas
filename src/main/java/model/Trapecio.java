/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author David
 */
public class Trapecio extends FigurasGeometricas{
    
    private float baseMenor;
    private float baseMayor;
    private float altura;

    public Trapecio() {
    }

    public Trapecio(float baseMenor, float baseMayor, float altura) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
    }

    
    @Override
    public float area() {
        if(validarNumeros(baseMenor, baseMayor, altura)){
            System.out.println("Valores no validos");
            return 0;
        }
        return (this.baseMayor+this.baseMenor/2)*this.altura;
    }

    @Override
    public String imprimir() {
        if(validarNumeros(baseMenor, baseMayor, altura)==true){
            return "Datos no validos";
        }
        return "Datos del trapecio:\nBase Mayor:"+this.baseMayor+"\nBase Menor:"+this.baseMenor+"\nAltura:"+this.altura+"\nArea:"+this.area();
    }    
    
    public boolean validarNumeros(float baseMenor, float baseMayor, float altura){
        if(baseMenor<0 || baseMayor<0 || altura<0){
            return true;
        }else if(baseMenor>baseMayor){
            return true;
        }
        return false;
    }
    
    @Override
    public void perdirDatos() {
        System.out.println("Ingresar la base mayor");
        this.baseMayor = entrada.nextFloat();
        System.out.println("Ingresar la base menor");
        this.baseMenor = entrada.nextFloat();
        System.out.println("Ingresar la altura");
        this.altura = entrada.nextFloat();
        if(validarNumeros(baseMenor, baseMayor, altura)){
            System.out.println("Datos no validos");
        }
    }
    
    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    public float getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(float baseMayor) {
        this.baseMayor = baseMayor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
