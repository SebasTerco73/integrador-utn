/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utn.trabajofinalargprograma;

import interfaces.funcionales.Operacion;
import interfaces.funcionales.Suma;

/**
 *
 * @author Gerardo
 */
public class MainProgFuncional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma lambdaSuma = (unNumero, otroNumero) -> unNumero + otroNumero;
        int unNumero = 3;
        int otroNumero = 5;
        int resultadoSuma = lambdaSuma.sumar(unNumero, otroNumero);
        System.out.println(resultadoSuma);
        
        unNumero = 10;
        otroNumero = 5;
        int suma = calcular(unNumero, otroNumero, (a, b) -> a + b);
        System.out.println( "La suma de " + unNumero + " y " + otroNumero + " es: " + suma);
        int resta = calcular(unNumero, otroNumero, (a, b) -> a - b);
        System.out.println( "La resta de " + unNumero + " y " + otroNumero + " es: " + resta);
        int producto = calcular(unNumero, otroNumero, (a, b) -> a * b);
        System.out.println( "El producto de " + unNumero + " y " + otroNumero + " es: " + producto);
        int cociente = calcular(unNumero, otroNumero, (a, b) -> a / b);
        System.out.println( "El cociente de " + unNumero + " y " + otroNumero + " es: " + cociente);
    }
    
    public static int calcular(int unNumero, int otroNumero, Operacion operacion) {
        return operacion.aplicar(unNumero, otroNumero);
    } 
    
    private static int sumarNumeros(int a, int b){
        return a + b;
    }
    
}
