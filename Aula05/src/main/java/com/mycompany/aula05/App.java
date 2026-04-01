/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author pedro.rbrandao
 */
public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 40);
        p1.mostrarDados();
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Maria Aparecida");
        p2.setIdade(50);
        p2.mostrarDados();
        
        Funcionario f1 = new Funcionario ("Maria", 35, 2800.00);
        f1.mostrarDados();
        
        ChefeDeDepartamento cd = new ChefeDeDepartamento("Luis", 60, 5000.00, "RH");
        cd.mostrarDados();
    }
}
