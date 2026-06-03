/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grasp;

/**
 *
 * @author pedro.rbrandao
 */
public class Cinegrafista {
    private Camera camera;
    // O cinegrafista trabalha com qualquer tipo de camera
    public Cinegrafista(Camera camera) {
        this.camera = camera;
    }
    
    public void iniciarGravacao() {
        System.out.println("O cinegrafista esta se preparando para gravar...");
        camera.gravar(); // O cinegrafista nao se importa com o tipo de camera
    }
    
    //Metodo para trocar a camera
    public void trocarCamera(Camera novaCamera) {
        this.camera = novaCamera;
        System.out.println("A camera foi trocada");
    }
    
    //Parar a gravaçao
    public void PararGravacao(Camera qCamera) {
        System.out.println("Gravacao parando...");
        camera = qCamera;
    }
}
