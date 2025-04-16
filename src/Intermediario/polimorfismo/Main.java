package Intermediario.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Vila da Folha";
        Naruto.idade = 16;
        Naruto.habilidadeEspecial();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Vila da Folha";
        Sasuke.idade = 17;
        Sasuke.habilidadeEspecial();
    }
}
