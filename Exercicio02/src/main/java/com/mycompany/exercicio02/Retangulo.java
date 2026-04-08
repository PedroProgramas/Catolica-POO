/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio02;

/**
 *
 * @author Pedro Henrique
 */
public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    /*Construtor*/
    public Retangulo(double base, double altura) {
        super(); /*Chama o construtor da classe pai (FormaGeometrica)*/
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
