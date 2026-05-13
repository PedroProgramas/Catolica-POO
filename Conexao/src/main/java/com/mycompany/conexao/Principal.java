/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao;
import java.sql.Connection;
/**
 *
 * @author pedro.rbrandao
 */
public class Principal {
        public static void main(String[] args) {
        ConexaoBD banco = new ConexaoBD();
        Connection conexao = null;
        
        try {
            conexao = banco.obterConexao();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
