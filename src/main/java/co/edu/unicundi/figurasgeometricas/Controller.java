/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

import java.util.Scanner;
import model.Circulo;
import model.FigurasGeometricas;
import model.Rectangulo;
import model.Rombo;
import model.Trapecio;
import model.Triangulo;

/**
 *
 * @author Santigo Bernal
 * @author David Quintero
 * @version 1.0.0
 */
public class Controller {
    //Se inicializan las variables a usar
    private static Scanner seleccionar = new Scanner(System.in);
    private static int valor;
    private static String desea;

    public static void main(String[] args) {
        String opcion;
        do {
            mostrarFiguras();
            System.out.println("¿Desea ingresar otra opcion? (S/N)");
            opcion = seleccionar.next();
        } while (opcion.equalsIgnoreCase("S"));

    }
    //Metodo estatico que permite solicitar datos para correr el programa
    public static void mostrarFiguras() {
        FigurasGeometricas circulo = new Circulo();
        FigurasGeometricas rectangulo = new Rectangulo();
        FigurasGeometricas rombo = new Rombo();
        FigurasGeometricas trapecio = new Trapecio();
        FigurasGeometricas triangulo = new Triangulo();
        System.out.println("--Progama para hallar el area de algunas figuras geometricas--");
        System.out.println("Seleccione:\n1.Circulo");
        System.out.println("2.Rectangulo");
        System.out.println("3.Rombo");
        System.out.println("4.Trapecio");
        System.out.println("5.Triangulo\n");
        valor = seleccionar.nextInt();
        switch (valor) {
            case 1:
                circulo.perdirDatos();
                System.out.println(circulo.imprimir());
                break;
            case 2:
                rectangulo.perdirDatos();
                System.out.println(rectangulo.imprimir());
                ;
                break;
            case 3:
                rombo.perdirDatos();
                System.out.println(rombo.imprimir());
                break;
            case 4:
                trapecio.perdirDatos();
                System.out.println(trapecio.imprimir());
                break;
            case 5:
                triangulo.perdirDatos();
                System.out.println(triangulo.imprimir());
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
