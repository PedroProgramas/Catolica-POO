/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grasp;

/**
 *
 * @author pedro.rbrandao
 */
public class Prato {
    private String nome;
    private String ingredientes;
    
    //Construtor
    public Prato(String nome, String ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }
    
    //Método para exibir detalhes do prato
    public void exibirDetalhes() {
        System.out.println("Prato: " + nome + "| Ingredientes: " + ingredientes);
    }
}
