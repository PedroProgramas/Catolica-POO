package com.mycompany.aula06;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motor v8 = new Motor("V8", 2.0, 240);
        Motor v4 = new Motor("V4", 1.5, 100);
        
        Carro fusca = new Carro("VW","Fusca",1970,v8);
        fusca.setNumeroPortas(2);
        fusca.setTipoCombustivel("Gasolina");
        fusca.ligar(); //ligar está no Veiculo
        fusca.abrirPortas(); 
    }
    
}
