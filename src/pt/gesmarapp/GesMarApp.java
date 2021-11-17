package pt.gesmarapp;

import pt.gesmarapp.teste.TesteGesMarApp;

public class GesMarApp {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao gestor de marcações de consultas e ou vacinação!!!!");

        TesteGesMarApp registos = new TesteGesMarApp();
        registos.carregar();

        registos.procurarUmUtilizadorComUmaMarcaçãoDeTétano();

    }

}
