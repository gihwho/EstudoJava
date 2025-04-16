package Iniciante;

import java.util.Scanner;

public class CadastroNinjas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int NUM_MAX = 10;
        String[] ninjas = new String[NUM_MAX];

        int opcoes = 0;
        int ninjasCadastrados = 0;

        while (opcoes != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcoes = input.nextInt();
            input.nextLine();

            switch (opcoes) {
                case 1:
                    if (ninjasCadastrados < NUM_MAX) {
                        System.out.println("Digite o nome do ninja: ");
                        String nome = input.nextLine();
                        ninjas[ninjasCadastrados] = nome;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninjas esta cheia...");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja na lista");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i] + " ID - " + i);
                        }
                    }
                    break;
                case 3:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja na lista");
                    } else {
                        System.out.println("Digite o ID do ninja que deseja deletar: ");
                        int ID = input.nextInt();
                        if (ID > ninjasCadastrados) {
                            System.out.println("ID invalido!");
                        }
                        for (int i = ID; i < ninjasCadastrados - 1; i++) {
                            ninjas[i] = ninjas[i + 1];
                        }
                        ninjas[ninjasCadastrados - 1] = null;
                        ninjasCadastrados--;
                        System.out.println("Ninja removido com sucesso!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo da aplicacao...");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}