/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;
import java.util.Scanner;
/**
 *
 * @author Pedro Henrique
 */
public class Exercicio06 {/*Execução da classe selecionada*/
    public static void main(String[] args) {/*Corpo da codificação, onde não gera retorno com o void*/
        Scanner scanner = new Scanner (System.in);/*Define o objeto da criação*/
        System.out.println ("Digite o salario base:");/*Declara o salário base*/
        
            double salariobase = scanner.nextDouble();/*Digita o salário*/
            double gratificacao = salariobase * 0.05;/*Gratificação de 5%*/
            double imposto = salariobase * 0.07;/*Imposto de 7%*/
            
            double areceber = salariobase + gratificacao - imposto;/*Cálculo geral*/
            
        System.out.println("Salario base:" +salariobase);/*Impressão do salário base*/
        System.out.println("Gratificacao:" +gratificacao);/*Impressão da gratificação*/
        System.out.println("Imposto:" +imposto);/*Impressão do imposto*/
        System.out.println("Valor final" +areceber);/*Impressão do valor a receber*/
            
    }
}
