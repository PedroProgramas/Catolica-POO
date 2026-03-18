/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03;
import ucb.estudo.modelo.Pessoa;
/**
 *
 * @author pedro.rbrandao
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Ola mundo");
        
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Paulo Gerente");
        p1.setCpf("111.111.111-11");
        p1.setAltura(1.75);
        p1.setPeso(80);
        
        Pessoa p2 = new Pessoa();
        
        p2.setNome("Edcarlos de Lima");
        p2.setCpf("312.145.354-36");
        p2.setAltura(1.50);
        p2.setPeso(50);
        
        //Exibir dados da pessoa 01
        System.out.println("Ola, seja bem-vindo: " + p1.getNome());
        p1.exibirIMC();
        //Exibir dados da pessoa 01
        System.out.println("Ola, seja bem-vindo: " + p2.getNome());
        p2.exibirIMC();
        
        Pessoa p3 = new Pessoa("Andre", "456.789.211-32", 1.90, 90);
        p3.exibirIMC();
    }
    
}
