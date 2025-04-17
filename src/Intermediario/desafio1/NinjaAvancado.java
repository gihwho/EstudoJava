package Intermediario.desafio1;

public class NinjaAvancado extends NinjaBase implements Ninja {
    String especialidade;
    TipoHabilidade tipoHabilidade;

    @Override
    public void executarHabilidades() {
        System.out.println("Meu nome é " + nome + " e eu executo " + tipoHabilidade + " e " + especialidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " eu tenho " + idade + " anos." + " Minha habilidade é: " +
                tipoHabilidade + ". E minha especialidade é " + especialidade);
    }
}
