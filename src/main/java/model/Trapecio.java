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
        if(validarNumeros(getBaseMenor(), getBaseMayor(), getAltura())){
            System.out.println("Valores no validos");
            return 0;
        }
        return ((this.getBaseMayor()+this.getBaseMenor())/2)*this.getAltura();
    }

    @Override
    public String imprimir() {
        if(validarNumeros(getBaseMenor(), getBaseMayor(), getAltura())==true){
            return "Datos no validos";
        }
        return "Datos del trapecio:\nBase Mayor:"+this.getBaseMayor()+"\nBase Menor:"+this.getBaseMenor()+"\nAltura:"+this.getAltura()+"\nArea:"+this.area();
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
        this.setBaseMayor(entrada.nextFloat());
        System.out.println("Ingresar la base menor");
        this.setBaseMenor(entrada.nextFloat());
        System.out.println("Ingresar la altura");
        this.setAltura(entrada.nextFloat());
        if(validarNumeros(getBaseMenor(), getBaseMayor(), getAltura())){
            System.out.println("Datos no validos");
        }
    }
    /**
     * @return the baseMenor
     */
    public float getBaseMenor() {
        return baseMenor;
    }

    /**
     * @param baseMenor the baseMenor to set
     */
    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    /**
     * @return the baseMayor
     */
    public float getBaseMayor() {
        return baseMayor;
    }

    /**
     * @param baseMayor the baseMayor to set
     */
    public void setBaseMayor(float baseMayor) {
        this.baseMayor = baseMayor;
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
