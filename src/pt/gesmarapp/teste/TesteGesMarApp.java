package pt.gesmarapp.teste;

import java.util.Arrays;
import java.util.Date;
import pt.gesmarapp.model.LocalVacinacao;
import pt.gesmarapp.model.Marcação;
import pt.gesmarapp.model.Vacina;
import pt.gesmarapp.model.Utilizador;

public class TesteGesMarApp {

    public TesteGesMarApp() {
    }

    static Vacina[] vacina = new Vacina[10];
    static LocalVacinacao localValinacaoOlivais;
//    Utilizador utente1, utente2, utente3; // em vez de gerir apenas 1 utilizador, gerir um array de utilizadores
    static Utilizador[] utentes = new Utilizador[3];

    public static void carregar() {

        vacina[0] = new Vacina("Vacina contra tétano", "Tétano", 2022, "Pfizer", 50.0);
        vacina[1] = new Vacina("Vacina contra Covid-19", "Covid-19", 2024, "Pfizer", 25.0);
        vacina[2] = new Vacina("Vacina contra Febre Amarela", "Febre Amarela", 2023, "Astra Zeneca", 40.0);

        localValinacaoOlivais = new LocalVacinacao("Centro de Saúde Olivais");

        utentes[0] = new Utilizador("João Amorim", new Date(1980, 6, 17));
        utentes[0].marcações[0] = new Marcação(vacina[1], localValinacaoOlivais);
        utentes[0].marcações[1] = new Marcação(vacina[1], localValinacaoOlivais);

        utentes[1] = new Utilizador("Francisco Guerra", new Date(1978, 6, 17));
        utentes[1].marcações[2] = new Marcação(vacina[0], localValinacaoOlivais);

        utentes[2] = new Utilizador("Sara Silva", new Date(1990, 2, 1));
        utentes[2].marcações[3] = new Marcação(vacina[2], localValinacaoOlivais);

    }

    public static Utilizador procurarUtilizador(String nomeVacina) {

        Utilizador encontrado = null;
        // a continuar aqui
        // definir uma iteração (com "for") que itere com o array dos utilizadores
        // dentro da iteração, verificar se o utilizador tem uma marcação de tétano
        // quando tiver encontrado o tal utilizador, devolvê-lo (p.ex. saindo precocemente da iteração om "break")
        for (Utilizador utente : utentes) {
            System.out.println("utente" + (utente));
//              if(){
//              // break             
//              }else{
//        }
        }
        return encontrado;
    }
//}
}
