/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estoque;

/**
 *
 * @author pedro.rbrandao
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantEmEstoque;
    
    public Produto(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quantEmEstoque = quant;
    }
    
    public void exibirInformacoes() {
        System.out.println(" Nome do produto: " + nome);
        System.out.println(" Preco do produto: " + preco);
        System.out.println(" Quantidade do produto: " + quantEmEstoque);
    }
    
    public void adicionarAoEstoque(int quant) {
        quantEmEstoque += quant;
    }
    
    public void removerDoEstoque(int quant) {
        quantEmEstoque -= quant;
        
    
    }
}
