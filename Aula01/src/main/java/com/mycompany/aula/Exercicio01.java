
package com.mycompany.aula;
import java.util.Scanner;

public class Exercicio01 {/*Execução da classe selecionada*/
    
    public static void main(String[] args) {/*Corpo da codificação, onde não gera retorno com o void*/
        Scanner scanner = new Scanner (System.in);/*Define o objeto da criação*/
        System.out.println("Digite os quatro numeros inteiros da operacao:");/*Declara os números pedidos*/
        
            int num1 = scanner.nextInt();/*Digita o primeiro número*/
            int num2 = scanner.nextInt();/*Digita o segundo número*/
            int num3 = scanner.nextInt();/*Digita o terceiro número*/
            int num4 = scanner.nextInt();/*Digita o quarto número*/
            
            int soma = num1 + num2 + num3 + num4;/*Código da soma dos números*/
        System.out.println("A soma dos numeros e:" +soma); /*Impressão dos resultados*/
        
    }
}