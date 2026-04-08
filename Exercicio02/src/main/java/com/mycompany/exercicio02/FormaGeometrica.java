/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio02;

/**
 *
 * @author Pedro Henrique
 */
public abstract class FormaGeometrica {
    /*Construtor da classe pai (superclasse)*/
    public FormaGeometrica() {
        /*Dentro daqui do construtor é onde se colocam geralmente os atributos*/
    }
    /*O return é colocado para auxiliar a conexão dos cálculos nas classes filhas*/
    /**
     * /
     * @return
     */
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}