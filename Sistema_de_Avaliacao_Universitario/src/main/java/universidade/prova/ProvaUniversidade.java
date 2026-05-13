/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author Pedro Henrique
 */
public abstract class ProvaUniversidade{

    public double notaAV1;
    public double notaAV2;
    public double notaAV3;
    protected double pesoAV1, pesoAV2, pesoAV3;
    protected double mediaMinima;
    protected boolean realizouProvaFinal;
    
     
    public abstract double calcularMedia();
    
    public boolean aprovado (){
        if (calcularMedia() >= mediaMinima){
            
            return true; 
            
        }else{
            
            return false;
        }
    }
    
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();
       
}
