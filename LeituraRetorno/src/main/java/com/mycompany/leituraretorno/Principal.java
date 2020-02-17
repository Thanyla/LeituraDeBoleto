package com.mycompany.leituraretorno;

/**
 *
 * @author narizinho
 */
public class Principal {
    public static void main(String[] args) {
        LeituraRetorno leituraBB = new LeituraRetornoBancoBrasil();
        ProcessarBoletos processador = new ProcessarBoletos();
        processador.setLeituraRetorno(leituraBB);
        String nomeArquivo = "banco-brasil-1.cvs";
        processador.processar(nomeArquivo);
        
    }
}
