/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

import model.Rectangulo;
import model.Triangulo;

/**
 *
 * @author David
 */
public class Controller {
    public static void main(String[] args) {
        Triangulo datosTriangulo = new Triangulo();
        
        datosTriangulo.setBase(4);
        datosTriangulo.setAltura(3);
        
        System.out.println(datosTriangulo.imprimir());
        
        Rectangulo datosRectangulo = new Rectangulo();
        datosRectangulo.setAltura(5);
        datosRectangulo.setBase(7);
        
        System.out.println(datosRectangulo.imprimir());
        
    }
}
