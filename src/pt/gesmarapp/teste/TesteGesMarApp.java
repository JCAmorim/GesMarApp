package pt.gesmarapp.teste;

import pt.gesmarapp.model.LocalVacinacao;
import pt.gesmarapp.model.Marcação;
import pt.gesmarapp.model.Vacina;
import pt.gesmarapp.model.Utilizador;

public class TesteGesMarApp {

    Vacina vacinaTétano, vacinaCorona, vacinaFebreAmarela;
    LocalVacinacao localValinacaoOlivais;
    Utilizador utente1, utente2, utente3; // em vez de gerir apenas 1 utilizador, gerir um array de utilizadores
    Utilizador[] utentes = new Utilizador[3];

    public void carregar() {

        vacinaTétano = new Vacina("Vacina contra tétano", "Tétano", 2022, "Pfizer", 50.0);
        vacinaCorona = new Vacina("Vacina contra Covid-19", "Covid-19", 2024, "Pfizer", 25.0);
        vacinaFebreAmarela = new Vacina("Vacina contra Febre Amarela", "Febre Amarela", 2023, "Astra Zeneca", 40.0);

        localValinacaoOlivais = new LocalVacinacao("Centro de Saúde Olivais");
        
                
        utente1 = new Utilizador("João Amorim" ,utente1.marcações[]);
        
        utente1.marcações[0] = new Marcação();
        utente1.marcações[0].vacina = vacinaCorona;
        utente1.marcações[1] = new Marcação();
        utente1.marcações[1].vacina = vacinaCorona;

        utente2 = new Utilizador();
        utente2.nomeCompleto = "Francisco Guerra";
        utente2.marcações[2] = new Marcação();
        utente2.marcações[2].vacina = vacinaTétano;

        utente3 = new Utilizador();
        utente3.nomeCompleto = "Sara Silva";
        utente3.marcações[3] = new Marcação();
        utente3.marcações[3].vacina = vacinaFebreAmarela;

        utentes[0] = utente1;
        utentes[1] = utente2;
        utentes[2] = utente2;
    }

    public void procurarUmUtilizadorComUmaMarcaçãoDeTétano() {
        // a continuar aqui
        // definir uma iteração (com "for") que itere com o array dos utilizadores
        // dentro da iteração, verificar de o utilizador tem uma marcação de tétano
        // quando tiver encontrado (nesta iteração) o tal utilizador, imprimi-lo na consola e "break" da iteração
        for (Utilizador u : utentes) {
                         if(){
                           System.out.println("O utente que... " );
                         
                         }
          
//   

        }

    }

}
