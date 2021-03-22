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
public class Rombo extends FigurasGeometricas{

    private float diagonalMayor;
    private float diagonalMenor;

    public Rombo() {
    }

    public Rombo(float diagonalMayor, float diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    
    @Override
    public float area() {
        return (diagonalMayor*diagonalMenor)/2;
    }
    
    @Override
    public String imprimir() {
        if (validarNumeros(diagonalMayor, diagonalMenor)) {
            return "Datos incorrectos";
        }
        return "Datos Rombo:\nDiagonal Mayor:"+this.diagonalMayor+"\nDiagonal Menor:"+this.diagonalMenor+"\nArea:"+this.area();
    }
    public boolean validarNumeros(float diagonalMayor, float diagonalMenor){
        return diagonalMayor<diagonalMenor;
    }
    
    @Override
    public void perdirDatos() {
        
    }
    
    
    public float getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(float diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public float getDiagonalMenos() {
        return diagonalMenor;
    }

    public void setDiagonalMenos(float diagonalMenos) {
        this.diagonalMenor = diagonalMenos;
    }

}
