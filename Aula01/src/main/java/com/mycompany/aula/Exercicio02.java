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
public class Exercicio02 {/*Execução da classe selecionada*/
    
    public static void main(String[] args) {/*Corpo da codificação, onde não gera retorno com o void*/
        Scanner scanner = new Scanner (System.in);/*Define o objeto da criação*/
        System.out.println("Digite os tres numeros que serao colocados na media aritmetica:");/*Declara os números pedidos*/
        
            float nota1 = scanner.nextFloat();/*Digita o primeiro número*/
            float nota2 = scanner.nextFloat();/*Digita o segundo número*/
            float nota3 = scanner.nextFloat();/*Digita o terceiro número*/
            
            float soma = (nota1 + nota2 + nota3) / 3;/*Código da media aritmetica dos números*/
            
        System.out.println("A media aritmetica e:" +soma);/*Impressão dos resultados*/
    }
}