package com.mycompany.leituraretorno;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanyla
 */
public class LeituraRetornoBancoBrasil implements LeituraRetorno {

    @Override
    public List<Boleto> lerArquivo(String nomeArquivo) {
        List<Boleto> lista = new ArrayList<>();
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String ln;
            while ((ln = reader.readLine()) != null) {
                String[] vetor = ln.split(";");
                Boleto boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setDataVencimento(LocalDate.parse(vetor[2], FORMATO_DATA));
                boleto.setDataPagamento(LocalDate.parse(vetor[3], FORMATO_DATA).atTime(0, 0));
                boleto.setCpfCliente(vetor[4]);
                boleto.setValor(Double.parseDouble(vetor[5]));
                boleto.setMulta(Double.parseDouble(vetor[6]));
                boleto.setJuros(Double.parseDouble(vetor[7]));
                lista.add(boleto);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return lista;
    }

}
