/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova.teste;
import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaUCB;
/**
 *
 * @author Pedro Henrique
 */
public class Teste {
        public static void main(String[] args) {

        // UCB

        ProvaUCB alunoUCB = new ProvaUCB();

        alunoUCB.notaAV1 = 9;
        alunoUCB.notaAV2 = 8;
        alunoUCB.notaAV3 = 7;

        System.out.println("===== UCB =====");

        System.out.println("Media: " + alunoUCB.calcularMedia());

        if(alunoUCB.aprovado()){

            System.out.println("Aluno aprovado");

        }else{

            System.out.println("Aluno reprovado");
        }

        // FAFIFO

        ProvaFafifo alunoFafifo = new ProvaFafifo();

        alunoFafifo.notaAV1 = 5;
        alunoFafifo.notaAV2 = 9;
        alunoFafifo.notaAV3 = 4;

        System.out.println("\n===== FAFIFO =====");

        System.out.println("Media: " + alunoFafifo.calcularMedia());

        if(alunoFafifo.aprovado()){

            System.out.println("Aluno aprovado");

        }else{

            System.out.println("Aluno reprovado");
        }
    }
}
