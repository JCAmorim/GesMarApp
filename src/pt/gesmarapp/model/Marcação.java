package pt.gesmarapp.model;


import java.util.Date;
import java.util.TimeZone;


public class Marcação {
//    Os fields, campos da classe
    
    int    idTipo;             //Exemplo: 001:Tétano.....
 public Vacina vacina;   //Exemplo: Tétano,Gripe..
 public LocalVacinacao local;      //Exemplo: Local de Vacinação
 public Date  dataMarcacao;        //Exemplo: Data marcação da Vacina xx-
 public TimeZone hora;             //Exemplo: Hora de Marcação da Vacinação
  
}
