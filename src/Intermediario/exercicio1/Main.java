package Intermediario;

public class Main {
    public static void main(String[] args) {
        //cria um objeto ninja Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 17;

        //chamada de metodo
        Sasuke.sharinganAtivado();
        String chamadaMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamadaMetodo);

        int quantoFalta = Sasuke.anosParaSerHokage(30);
        System.out.println("Quanto tempo falta para se tornar Hokage: " + quantoFalta);

        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 17;
    }
}
