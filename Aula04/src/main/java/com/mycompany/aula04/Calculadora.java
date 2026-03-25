/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author pedro.rbrandao
 */
public class Calculadora {
    // Soma de dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }
    
    //Soma de três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    //Soma de dois doubles
    public double somar(double a, double b) {
        return a + b;
    }
    
    //Concatenação de strings
    public String somar(String a, String b) {
        return a + b;
    }
    
    public static int somar(double a, int b) {
        return (int) (a + b);
    }
    
    public static double calculaMedia(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }
}
