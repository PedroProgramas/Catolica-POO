/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author pedro.rbrandao
 */
public class ConexaoBD {
    //Variáveis 3 - URL, Usuario e Senha do Banco de Dados.
    private static final String URL = "jdbc:mysql://localhost:3307/conexao";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    
    public Connection obterConexao() throws Exception {
        try {
            //Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Estabelece a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexao com o banco de dados estabelecida com sucesso!");
            return conexao;
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver JDBC do MySQL não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            throw new Exception("Erro ao conectar ao banco de dados: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exceção não identifica" + e.getMessage());
            return null;
        }
    }    
}
