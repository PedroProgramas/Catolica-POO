/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author pedro.rbrandao
 */
public class Funcionario extends Pessoa {
    private double salario;
    
    public Funcionario(String nome, int idade, double salario){
        super(nome,idade);
        this.salario = salario;
    }
    
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salario: " + salario);
    }
}
