package Intermediario.desafio1;

public class NinjaBasico extends NinjaBase implements Ninja {
    TipoHabilidade tipoHabilidade;

    @Override
    public void executarHabilidades() {
        System.out.println("Meu nome é " + nome + " e eu executo " + tipoHabilidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " eu tenho " + idade + " anos." + " Minha habilidade é: " + tipoHabilidade);
    }
}
