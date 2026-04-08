/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio02;

/**
 *
 * @author Pedro Henrique
 */
public class Circulo extends FormaGeometrica {
    private double raio;

    /*Construtor*/
    public Circulo(double raio) {
        super(); /*Chama o construtor da classe pai*/
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        /*Fórmula da área: π * r²*/
        return Math.PI * Math.pow(raio, 2);
    }
    @Override
    public double calcularPerimetro() {
        /*Fórmula do perímetro (circunferência): 2 * π * r*/
        return 2 * Math.PI * raio;
    }
}