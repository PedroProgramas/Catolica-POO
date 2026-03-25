/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estoque;

/**
 *
 * @author pedro.rbrandao
 */
public class TestaProduto {
    
    public static void main(String[] args) {
        //Criar tres produtos
        Produto p1 = new Produto("Monitor 24'", 900, 10);
        Produto p2 = new Produto("CPU", 300, 25);
        Produto p3 = new Produto("Mouse", 30.5, 50);
        
        //exibir informações
        p1.exibirInformacoes();
        System.out.println("****************");
        p2.exibirInformacoes();
        System.out.println("****************");
        p3.exibirInformacoes();
        System.out.println("****************");
        //como o void do 'adicionarAoEstoque' e o 'removerDoEstoque' não retorna, é preciso que seja colocado o 'exibirInformações'
        p1.adicionarAoEstoque(10);
        p1.exibirInformacoes();
        System.out.println("****************");
        p2.adicionarAoEstoque(3);
        p2.exibirInformacoes();
        System.out.println("****************");
        p3.removerDoEstoque(3);
        p3.exibirInformacoes();
        System.out.println("****************");
    }
}
