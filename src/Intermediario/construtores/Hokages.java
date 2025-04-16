package Intermediario.construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages() {
        //No args constructor
    }

    public Hokages(String nome, int idade, boolean vivoOuNao) {
        //All args constructor
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
