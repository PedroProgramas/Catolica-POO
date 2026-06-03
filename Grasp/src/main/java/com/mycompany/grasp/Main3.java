/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.grasp;

/**
 *
 * @author pedro.rbrandao
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando objetos de cada função
        Recepcionista recepcionista = new Recepcionista();
        Camareiro camareiro = new Camareiro();
        Gerente gerente = new Gerente();
        
        //Testando as funções coesas de cada funcionário
        recepcionista.fazerCheckIn("João");
        camareiro.limparQuarto(101);
        gerente.gerenciarReservas();
        
        //Outras responsabilidades específicas
        recepcionista.fazerCheckOut("João");
        camareiro.reporSuprimentos(101);
        gerente.fazerRelatorioFinanceiro();
    }
    
}
