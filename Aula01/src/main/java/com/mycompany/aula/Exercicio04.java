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
public class Exercicio04 {/*Execução da classe selecionada*/
    public static void main(String[] args) {/*Corpo da codificação, onde não gera retorno com o void*/
        Scanner scanner = new Scanner (System.in);/*Define o objeto da criação*/
        System.out.println("Digite o salario do funcionario, para que este seja aumentado em 25%:");/*Declara o salário atendido para modificação*/
        
            double salario = scanner.nextDouble();/*Digita o salário*/
            double aumento = salario + (salario *0.25);/*Cálculo do aumento de salário*/
                    
        System.out.println("O salario e:" +aumento);/*Impressão dos resultados*/;            
    }
}
