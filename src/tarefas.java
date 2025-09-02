import java.util.Scanner;

public class tarefas {

    boolean completa;

    void criartarefa(){
        System.out.println("adicione sua tarefa");
    }
    Scanner escreva = new Scanner(System.in);

    String tarefa= escreva.nextLine();

    void retorno(){
        System.out.println("a tarefa " + tarefa + "foi adicionada");
    }

    String tituloDaTarefa;

    public tarefas(String tituloDaTarefa) {
        this.tituloDaTarefa = tituloDaTarefa;
    }
}
