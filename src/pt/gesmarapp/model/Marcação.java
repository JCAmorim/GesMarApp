package pt.gesmarapp.model;


import java.util.Date;
import java.util.TimeZone;


public class Marcação {
//    Os fields, campos da classe
    
    int    idTipo;             //Exemplo: 001:Tétano.....
    TipoVacinacao descrição;   //Exemplo: Tétano,Gripe..
    Date  dataMarcacao;        //Exemplo: Data marcação da Vacina xx-
    TimeZone hora;             //Exemplo: Hora de Marcação da Vacinação
  
}
