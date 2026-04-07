package com.mycompany.aula06;

public class Motor {
    private String tipo;
    private double potencia;
    private double cilindrada;
    
    public Motor(String tipo, double potencia, double cilindrada){
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }
    
    public void ligar(){
        System.out.println("Motor " + tipo + " ligando...");
    }
    public void desligar(){
        System.out.println("Motor " + tipo + " desligando...");
    }
}
