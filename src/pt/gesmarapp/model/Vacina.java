package pt.gesmarapp.model;

public class Vacina {

    public String nome; //Exemplo: Gripe, Febre Tifóide,Febre Amarela...
    public String doença;
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

    @Override
    public String toString() {
        return "Vacina{" + "nome=" + nome + ", doen\u00e7a=" + doença + ", anoDeValidade=" + anoDeValidade + ", fabricante=" + fabricante + ", peso=" + peso + '}';
    }

}
