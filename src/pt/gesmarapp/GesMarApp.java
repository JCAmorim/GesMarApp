package pt.gesmarapp;

import pt.gesmarapp.model.Marcação;
import pt.gesmarapp.model.Vacina;
import pt.gesmarapp.model.Utilizador;
import pt.gesmarapp.teste.TesteGesMarApp;

public class GesMarApp {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao gestor de marcações de consultas e ou vacinação!!!!");

        TesteGesMarApp teste = new TesteGesMarApp();
        teste.carregar();

//        System.out.println(""  + utente1);
    }

}
