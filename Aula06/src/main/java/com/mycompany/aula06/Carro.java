package com.mycompany.aula06;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    
    public Carro(String marca, String modelo, int ano, Motor motor){
        super(marca, modelo, ano, motor); //Construtor da superclasse
    }
    
    public void abrirPortas(){
        System.out.println("Abrindo as " + numeroPortas + " portas ");
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
