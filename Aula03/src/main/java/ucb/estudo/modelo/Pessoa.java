/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.modelo;

/**
 *
 * @author pedro.rbrandao
 */
public class Pessoa {

    private String nome;
    private double altura;
    private String cpf;
    private int peso;
    private double imc;
    /*construtor default*/
    public Pessoa() {

    }

    /*o public abaixo usa das declarações em parentêses ao invés de digitar um por um(construtor parâmetro)*/
    public Pessoa(String nome, String cpf, double altura, int peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
    }

    /*o public abaixo usa as declarações get e set para cada um dos atributos*/
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void exibirIMC() {
        double imc = peso / (altura * altura);
        System.out.println("O seu IMC e" + imc);
    }
}
