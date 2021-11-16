package pt.gesmarapp;

import pt.gesmarapp.model.Marcação;
import pt.gesmarapp.model.NomeVacina;
import pt.gesmarapp.model.Utilizador;

public class GesMarApp {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao gestor de marcações de consultas e ou vacinação!!!!");

        Marcação marcacao = new Marcação();
        NomeVacina vacina = new NomeVacina();

        Utilizador utente1 = new Utilizador();
        utente1.nomeCompleto = "João Amorim";
        utente1.marcacao.descrição.vacina = "Tetano";
        
//        System.out.println(""  + utente1);

    }

}
