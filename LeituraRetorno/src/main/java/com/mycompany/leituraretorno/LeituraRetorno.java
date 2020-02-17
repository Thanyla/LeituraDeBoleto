/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituraretorno;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Thanyla
 */
public interface LeituraRetorno {
    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = 
            DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
    public List<Boleto> lerArquivo(String nomeArquivo);
}
