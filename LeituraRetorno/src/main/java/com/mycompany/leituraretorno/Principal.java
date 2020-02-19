package com.mycompany.leituraretorno;

/**
 *
 * @author narizinho
 */
public class Principal {
    public static void main(String[] args) {
        LeituraRetorno leituraBB = new LeituraRetornoBancoBrasil();
        ProcessarBoletos processador = new ProcessarBoletos(leituraBB);
        
        String nomeArquivo = "banco-brasil-1.csv";
        processador.processar(nomeArquivo);
        
        nomeArquivo = "bradesco-1.csv";
        LeituraRetornoBradesco leituraRetornoBradesco = new LeituraRetornoBradesco();
        processador.processar(nomeArquivo);
        
    }
}
