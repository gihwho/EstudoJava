package Intermediario.heranca;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar o amuleto";
        sasuke.nivelDeDificuldade = "Alta";
        sasuke.statusDaMissao = "Em andamento";
        sasuke.mostrarInformacoes();
    }
}
