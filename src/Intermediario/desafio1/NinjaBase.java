package Intermediario.desafio1;

public class NinjaBase {
    String nome;
    TipoHabilidade tipoHabilidade;
    int idade;

    public NinjaBase(String nome, int idade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public NinjaBase() {

    }

}
