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
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);/*Define o objeto da criação*/
        System.out.println("Digite os tres numeros e os tres pesos que serao colocados na media ponderada:");/*Declara os números e os pesos pedidos*/
        
            float nota1 = scanner.nextFloat();/*Digita a primeira nota*/
            float nota2 = scanner.nextFloat();/*Digita a segunda nota*/
            float nota3 = scanner.nextFloat();/*Digita a terceira nota*/
            float peso1 = scanner.nextFloat();/*Digite o primeiro peso*/
            float peso2 = scanner.nextFloat();/*Digite o segundo peso*/
            float peso3 = scanner.nextFloat();/*Digite o terceiro peso*/
        
            float total_pesos = peso1 + peso2 + peso3; /*Código da soma dos pesos para o valor final ser executado na divisão*/
            float soma = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)/total_pesos;/*Código da média ponderada*/
            
            System.out.println("A media ponderada e:" +soma);/*Impressão dos resultados*/
    }
}
