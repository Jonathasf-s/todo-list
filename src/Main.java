import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

int NumUsuario;
        Scanner escreva = new Scanner(System.in);

        // foi criado um pequenho menu
        // objetivo adicionar uma tarefa

        do {

            System.out.println("\n===== Menu da LISTA DE AFAZERES =====");
            System.out.println("1. Ver conteudo da lista");
            System.out.println("2. adicionar tarefa a lista");
            System.out.print("Escolha uma opção: ");
            System.out.println("digite um numero");
a
            NumUsuario = escreva.nextInt();

            //Todo  ...  é nescessario cirar uma forma de mostrar tudo o q sera registrado na classe Tarefas


            switch (NumUsuario) {

                case 1:
                    System.out.println("vc escolheu ver conteudo:");
                    break;
                case 2:
                    System.out.println("vc escolheu registrar tarefas");
                    break;
            }
        }
        while (NumUsuario > 2 || NumUsuario == 0 );


        escreva.close();
        }
    }
