package pt.gesmarapp.model;

public class Vacina {

    String nome; //Exemplo: Gripe, Febre Tifóide,Febre Amarela...
    String doença;
    int anoDeValidade; // ano
    String fabricante;
    double peso; // gramas

    public Vacina(String nome, String doença, int anoDeValidade, String fabricante, double peso) {
        this.nome = nome;
        this.doença = doença;
        this.anoDeValidade = anoDeValidade;
        this.fabricante = fabricante;
        this.peso = peso;
    }

}
