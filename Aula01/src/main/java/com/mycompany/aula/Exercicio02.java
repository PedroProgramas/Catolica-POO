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
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);/*Define o objeto da criação*/
        System.out.println("Digite os tres numeros que serao colocados na media aritmetica:");/*Declara os números pedidos*/
        
            float nota1 = scanner.nextInt();/*Digita o primeiro número*/
            float nota2 = scanner.nextInt();/*Digita o segundo número*/
            float nota3 = scanner.nextInt();/*Digita o terceiro número*/
            
            float soma = (nota1 + nota2 + nota3) / 3;
            
        System.out.println("A media aritmetica e:" +soma);
    }
}