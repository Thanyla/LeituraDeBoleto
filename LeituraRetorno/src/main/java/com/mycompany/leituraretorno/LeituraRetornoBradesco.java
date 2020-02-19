/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituraretorno;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author narizinho
 */
public class LeituraRetornoBradesco implements LeituraRetorno{

    @Override
    public List<Boleto> lerArquivo(String nomeArquivo) {
        List<Boleto> lista = new ArrayList<>();
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String ln;
            while((ln = reader.readLine()) != null){
                String[] vetor = ln.split(";");
                Boleto boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setAgencia(vetor[2]);
                boleto.setContaBancaria(vetor[3]);
                boleto.setDataVencimento(LocalDate.parse(vetor[4], FORMATO_DATA_HORA));
                boleto.setDataPagamento(LocalDate.parse(vetor[5], FORMATO_DATA_HORA).atTime(0,0));
                boleto.setCpfCliente(vetor[6]);
                boleto.setValor(Double.parseDouble(vetor[7]));
                boleto.setMulta(Double.parseDouble(vetor[8]));
                boleto.setJuros(Double.parseDouble(vetor[9]));
                lista.add(boleto);
            }
            reader.readLine();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return lista;
    }
    
}


