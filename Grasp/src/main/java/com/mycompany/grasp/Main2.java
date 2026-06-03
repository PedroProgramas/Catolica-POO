/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.grasp;

/**
 *
 * @author pedro.rbrandao
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criando diferentes tipos de cameras
        Camera dslr = new CameraDSLR();
        Camera actionCam = new CameraAction();
        
        //O cinegrafista usa inicialmente a camera DSLR
        Cinegrafista cinegrafista = new Cinegrafista(dslr);
        cinegrafista.iniciarGravacao();
        
        cinegrafista.PararGravacao(dslr);
    }
}
