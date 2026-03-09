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
public class Exercicio05 {/*Execução da classe selecionada*/
    public static void main(String[] args) {/*Corpo da codificação, onde não gera retorno com o void*/
        Scanner scanner = new Scanner (System.in);/*Define o objeto da criação*/
        System.out.println ("Digite o salario e o percentual de aumento a serem calculados:");/*Declara o salário e o percentual para modificação*/
            
            double salario = scanner.nextDouble();/*Digita o salário*/
            double percentual = scanner.nextDouble();/*Digita o percentual*/
            
            double aumento = salario * (percentual/100);/*Digita o percentual*/
            double salaumentado = salario + aumento; /*Cálculo do aumento de salário*/
        
        System.out.println ("Valor do aumento:" +aumento);/*Impressão do aumento*/
        System.out.println ("Valor do salario novo:" +salaumentado);/*Impressão dos resultados*/
    }
}
