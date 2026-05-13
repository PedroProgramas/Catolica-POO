/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author Pedro Henrique
 */
public class ProvaFafifo extends ProvaUniversidade {
        public ProvaFafifo(){

        pesoAV1 = 1;
        pesoAV2 = 1;
        pesoAV3 = 3;

        mediaMinima = 6;
    }

    @Override
    public double calcularMedia(){

        return ((notaAV1 * pesoAV1)
                + (notaAV2 * pesoAV2)
                + (notaAV3 * pesoAV3))
                / (pesoAV1 + pesoAV2 + pesoAV3);
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade(){

        return new ProvaFinalFafifo();
    }
}

