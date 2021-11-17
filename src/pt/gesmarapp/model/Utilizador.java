package pt.gesmarapp.model;

import java.util.Date;

public class Utilizador {

    public String nomeCompleto;    //Exempolo: CC
    public CartaoCidadao númeroCC;     //Exemplo: Cartão do Cidadão   
    Date dataNascimento;       //Exemplo: xx-xx-xxxx
    Morada morada;             // Exemplo: Morada      
  //  public Marcação[] marcações;         //Exemplo: Marcação de vacinação
  public Marcação[] marcações = new Marcação[4];

    public Utilizador(String nomeCompleto, Marcação[] marcações) {
        this.nomeCompleto = nomeCompleto;
        this.marcações = marcações;
    }

}
