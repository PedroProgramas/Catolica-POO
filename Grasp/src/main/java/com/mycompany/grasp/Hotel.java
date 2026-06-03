/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grasp;

//Classe Recepcionista (Alta coesão para tarefas relacionadas a hóspedes)
public class Recepcionista {
    public void fazerCheckIn(String hospede) {
    }
    public void fazerCheckOut(String hospede) {
}
    
//Classe Camareiro(Alta coesão para tarefas relacionadas à hóspedes)
public class Camareiro {
    public void limparQuarto(int numeroDoQuarto) {
    }
    public void reporSuprimentos(int numeroDoQuarto) {
}
    
//Classe Gerente (Alta coesão para tarefas administrativas)
public class Gerente {
    public void gerenciarReservas() {
    }
    public void fazerRelatorioFinanceiro() {
}
    
//Classe Principal para testar o padrão high cohesion
public class Main {
    
}