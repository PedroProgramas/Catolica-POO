/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grasp;

/**
 *
 * @author pedro.rbrandao
 */
public class CarrinhoDeCompras {
    private List<Produto> produtos;
    
    // Construtor
    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }
    
    // Adiciona um produto ao carrinho
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }
    
    //Método que calcula o valor total dos produtos no carrinho
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos){
            total += produto.getPreco(); // O CarrinhoDeCompras conhece todos os produtos e seus preços
        }
        return total;
    }
}
