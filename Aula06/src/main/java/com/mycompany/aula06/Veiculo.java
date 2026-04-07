package com.mycompany.aula06;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected Motor motor; // composição.
    
    public Veiculo(String marca, String modelo, int  ano, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }
    
    public void ligar(){
        System.out.println("Ligando o "+ marca + " de modelo " + modelo);
        motor.ligar();
    }
    
}
