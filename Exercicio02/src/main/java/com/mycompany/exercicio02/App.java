/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio02;

/**
 *
 * @author Pedro Henrique
 */
public class App {

    /**
     *
     * @param args
     */
    public static void main (String[] args) {
        /*Criando um Retângulo com base 15 e altura 20*/
        Retangulo meuRetangulo = new Retangulo(15.0, 20.0);
        System.out.println("RETANGULO");
        System.out.println("Area: " + meuRetangulo.calcularArea());
        System.out.println("Perimetro: " + meuRetangulo.calcularPerimetro());
        /*Quebra linha*/
        System.out.println();
        System.out.println();
        /*Criando um Círculo com raio 5*/
        Circulo meuCirculo = new Circulo(5.0);
        System.out.println("CIRCULO");
        /*O printf ajuda a formatar o resultado para apenas 2 casas decimais*/ 
        System.out.printf("Area: %.2f\n", meuCirculo.calcularArea());
        System.out.printf("Perimetro: %.2f\n", meuCirculo.calcularPerimetro());
    }
}