/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.grasp;

/**
 *
 * @author pedro.rbrandao
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Pará Lanches");
        
        //O restaurante cria (prepara) um prato
        Prato prato1 = restaurante.prepararPrato(" Suco de Laranjam,Fígado, Pizza de Pé de galinha,Pão de Queijo");
        prato1.exibirDetalhes();
        
        Prato prato2 = restaurante.prepararPrato("Gabiroba, Graviola, Banana, Tomate, Risoto");
        
        
    }
    
}
