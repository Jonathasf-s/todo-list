import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Tarefa> minhaListaDeTarefas = new ArrayList<>();
    static Scanner leitorDeTeclado = new Scanner(System.in);


    public static void main(String[] args) {
        int opcaoDoUsuario = 0;
        System.out.println("Bem-vindo à sua Lista de Tarefas Pessoal!");

        // O loop principal que gerencia o menu
        while (opcaoDoUsuario != 5) {
            exibirMenu(); // Chama a função que mostra o menu

            opcaoDoUsuario = leitorDeTeclado.nextInt();
            leitorDeTeclado.nextLine();

            switch (opcaoDoUsuario) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    marcarTarefaComoConcluida();
                    break;
                case 4:
                    removerTarefa();
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


