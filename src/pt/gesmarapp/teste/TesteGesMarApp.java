package pt.gesmarapp.teste;

import pt.gesmarapp.model.Marcação;
import pt.gesmarapp.model.Vacina;
import pt.gesmarapp.model.Utilizador;

public class TesteGesMarApp {

    public void carregar() {

        Vacina vacinaTétano = new Vacina();
        vacinaTétano.nome = "Tétano";

        Marcação marcacaoDeVacinaDeTétano = new Marcação();
        marcacaoDeVacinaDeTétano.vacina = vacinaTétano;

        Utilizador utente1 = new Utilizador();
        utente1.nomeCompleto = "João Amorim";
//        utente1.marcacao.descrição.vacina = "Tetano";
        utente1.marcacao = marcacaoDeVacinaDeTétano;

    }

}
