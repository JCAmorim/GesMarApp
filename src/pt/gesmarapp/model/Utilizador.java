package pt.gesmarapp.model;

import java.util.Arrays;
import java.util.Date;

public class Utilizador {

    public String nomeCompleto;    //Exempolo: CC
    public CartaoCidadao númeroCC;     //Exemplo: Cartão do Cidadão   
    public Date dataNascimento;       //Exemplo: xx-xx-xxxx
    Morada morada;             // Exemplo: Morada      
    // public Marcação[] marcações;         //Exemplo: Marcação de vacinação
    public Marcação[] marcações = new Marcação[4];

    public Utilizador(String nomeCompleto, Date dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
    }

    public Marcação[] getMarcações() {
        return marcações;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "nomeCompleto=" + nomeCompleto + ", dataNascimento=" + dataNascimento + ", marca\u00e7\u00f5es=" + Arrays.toString(getMarcações()) + '}';
    }

}
