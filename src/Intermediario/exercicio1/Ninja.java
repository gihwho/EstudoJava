package Intermediario.exercicio1;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public void sharinganAtivado() {
        System.out.println("O sharingan foi ativado!");
    }

    public String euSouUmNinja() {
        return "Oi, eu sou um ninja.";
    }

    public int anosParaSerHokage(int idadeMin) {
        return idadeMin - idade;
    }
}
