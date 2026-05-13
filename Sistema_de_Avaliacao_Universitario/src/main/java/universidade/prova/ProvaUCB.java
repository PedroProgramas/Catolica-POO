/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author Pedro Henrique
 */
public class ProvaUCB extends ProvaUniversidade {
    public ProvaUCB(){
        pesoAV1 = 1;
        pesoAV2 = 1;
        pesoAV3 = 1;
        mediaMinima = 7;
    }

    @Override
    public double calcularMedia(){

        return (notaAV1 + notaAV2 + notaAV3) / 3;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade(){

        return new ProvaAV3UCB();
    }
}
