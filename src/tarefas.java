import java.util.Scanner;
import java.util.ArrayList;

public class tarefas {
    // se completa ou nao
    private boolean completa;

    // nome da tarefa
   private String titulo;

   public tarefas(String titulo){
       this.titulo=titulo;
       this.completa = false;
   }

   String getTitulo(){
       return titulo;
   }

}




