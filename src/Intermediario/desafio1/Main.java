package Intermediario.desafio1;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Kiba = new NinjaBasico();
        Kiba.nome = "Kiba Inuzuka";
        Kiba.idade = 8;
        Kiba.tipoHabilidade = TipoHabilidade.NINJUTSO;
        Kiba.executarHabilidades();
        Kiba.mostrarInformacoes();

        NinjaAvancado Sasuke = new NinjaAvancado();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 22;
        Sasuke.tipoHabilidade = TipoHabilidade.RINNEGAN;
        Sasuke.especialidade = "MANGEKYOU SHARINGAN";
        Sasuke.executarHabilidades();
        Sasuke.mostrarInformacoes();
    }
}
