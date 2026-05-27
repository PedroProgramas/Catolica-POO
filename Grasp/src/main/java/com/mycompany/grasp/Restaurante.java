/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grasp;

/**
 *
 * @author pedro.rbrandao
 */
public class Restaurante {
    private String nomeRestaturante;
    
    public Restaurante(String nomeRestaurante) {
        this.nomeRestaturante = nomeRestaurante;
    }
    
    //Método criador: O restauranet cria o prato
    public Prato prepararPrato(String nome, String ingredientes) {
        System.out.println(nomeRestaturante + " está prato:" + nome);
        return new Prato(nome, ingredientes);
    }
}
