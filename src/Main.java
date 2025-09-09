import java.util.Scanner;

public class Main {
    static Scanner leitorDeTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoDoUsuario = 0;
        System.out.println("Bem-vindo à sua Lista de Tarefas Pessoal!");

        while (opcaoDoUsuario != 5) {
            //  ==== MENU ====

            opcaoDoUsuario = leitorDeTeclado.nextInt();
            leitorDeTeclado.nextLine();

            switch (opcaoDoUsuario) {
                case 1:
                    // Função de adição de tarefa
                    break;
                case 2:
                    // Função de listar tarefas
                    break;
                case 3:
                    // Função de marcar como concluída
                    break;
                case 4:
                    // Função de remover tarefa
                    break;
                case 5:
                    System.out.println("Até a próxima! Mantenha a organização!");
                    break;
                default:
                    System.out.println("Opção inválida, por favor, escolha um número do menu.");
                    break;
            }
        }
    }
}