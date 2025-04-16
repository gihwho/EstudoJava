package Intermediario.construtores;

public class Main {
    public static void main(String[] args) {
        Hokages Hashirama = new Hokages();
        Hashirama.nome = "Hashirama";

        Hokages Tobirama = new Hokages("Tobirama Senju", 34, false);
        System.out.println("Hokage " + Tobirama.nome + ", idade: " + Tobirama.idade + ", esta vivo?: " + Tobirama.vivoOuNao);

        Hokages Minato = new Hokages("Minato Namikaze");
        System.out.println(Minato.nome);
    }
}
