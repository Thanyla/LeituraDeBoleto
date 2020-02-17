/*
 *Exemplo dispṕonivel em: http://manoelcampos.com/padroes-projetos/comportamentais/strategy/
 */
package com.mycompany.leituraretorno;

/**
 *
 * @author Thanyla
 */
public class ProcessarBoletos {
    
    private LeituraRetorno leituraRetorno;
    
    
    public void processar(String nomeArquivo){}

    public LeituraRetorno getLeituraRetorno() {
        return leituraRetorno;
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
