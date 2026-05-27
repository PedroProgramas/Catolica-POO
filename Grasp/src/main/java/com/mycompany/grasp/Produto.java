/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grasp;

/**
 *
 * @author pedro.rbrandao
 */
public class Produto {
    private String nome;
    private double preco;
    
    //Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    //Método para obter o preço do produto
    public double getPreco() {
        return preco;
    }
    
    public String getNome() {
        return nome;
    }
}
