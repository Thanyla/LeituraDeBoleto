/*
 *Exemplo disponivel em: http://manoelcampos.com/padroes-projetos/comportamentais/strategy/
 */
package com.mycompany.leituraretorno;

import java.util.List;

/**
 *
 * @author Thanyla
 */
public class ProcessarBoletos {
    
    private LeituraRetorno leituraRetorno;
    
    
    public void processar(String nomeArquivo){
        List<Boleto> boletos = leituraRetorno.lerArquivo(nomeArquivo);
        boletos.forEach((boleto) -> {
            System.out.println("Id: " + boleto.getId()
                    + " Banco: " + boleto.getCodBanco());
        });
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
