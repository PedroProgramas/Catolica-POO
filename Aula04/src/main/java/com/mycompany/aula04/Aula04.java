/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04;

/**
 *
 * @author pedro.rbrandao
 */
public class Aula04 {

    public static void main(String[] args) {
        //Instância da classe Pessoa
        Pessoa p1 = new Pessoa ();
        //Uso do encapsulamento get e set
        p1.setNome("Alexandre");
        p1.setIdade(50);
        System.out.println("Nome: " + p1.getNome() + " Sua idade eh: " + p1.getIdade());
        
        //Instância de objeto com construtor;
        Pessoa p2 = new Pessoa("João Silva", 60);
        System.out.println("Nome: " + p2.getNome() + " Sua idade eh: " + p2.getIdade());
        
        //Criar instância de calculadora
        Calculadora c = new Calculadora();
        System.out.println("A soma das suas idades eh: " + c.somar(p1.getIdade(), p2.getIdade()));
        
        //somar duas idades com método static
        System.out.println("A soma de dois numeros: " + Calculadora.somar(65.7, 50));
        
        //média de valores
        double[] notas = {10, 8, 5, 9, 7.5, 9.5};
        System.out.println("Media dos valores eh: " + Calculadora.calculaMedia(notas));
    }
}