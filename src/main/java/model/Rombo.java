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
public class Rombo extends FigurasGeometricas{

    //Se inicializan las variables a usar
    private float diagonalMayor;
    private float diagonalMenor;
    
    //constructor 
    public Rombo() {
    }
    //Constructor sobrecargado
    public Rombo(float diagonalMayor, float diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    
    //Se implementa la clase area que esta heredando de la clase FigurasGeometricas
    @Override
    public float area() {
        if(validarNumeros(getDiagonalMayor(), getDiagonalMenor())){
            System.out.println("Dator erroneos");
            return 0;
        }
        return (getDiagonalMayor()*getDiagonalMenor())/2;
    }
    
    //En este metodo se implementa para poder hacer la impresion de variables
    @Override
    public String imprimir() {
        if (validarNumeros(getDiagonalMayor(), getDiagonalMenor())) {
            return "Datos incorrectos";
        }
        return "Datos Rombo:\nDiagonal Mayor:"+this.getDiagonalMayor()+"\nDiagonal Menor:"+this.getDiagonalMenor()+"\nArea:"+this.area();
    }
    //Metodo que permite validar los datos que se ingresan
    public boolean validarNumeros(float diagonalMayor, float diagonalMenor){
        return diagonalMayor<diagonalMenor;
    }
    //Metodo que se implementa para solicitar datos para la instancia
    @Override
    public void perdirDatos() {
        System.out.println("Ingrese el valor de la diagonal mayor");
        this.setDiagonalMayor(entrada.nextFloat());
        System.out.println("Ingrese el valor de la diagonal menor");
        this.setDiagonalMenor(entrada.nextFloat());
        if(validarNumeros(getDiagonalMayor(), getDiagonalMenor())){
            System.out.println("Dator erroneos");
        }
    }
    
    /**
     * @return the diagonalMayor
     */
    public float getDiagonalMayor() {
        return diagonalMayor;
    }

    /**
     * @param diagonalMayor the diagonalMayor to set
     */
    public void setDiagonalMayor(float diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    /**
     * @return the diagonalMenor
     */
    public float getDiagonalMenor() {
        return diagonalMenor;
    }

    /**
     * @param diagonalMenor the diagonalMenor to set
     */
    public void setDiagonalMenor(float diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

}
