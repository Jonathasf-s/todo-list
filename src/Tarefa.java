import java.time.LocalDateTime;

public class Tarefa {
    // Contador para IDs
    private static int contador = 0;

    // Atributos principais da entidade
    private final int id;   //Método final para se tornar imutável
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataCriacao;

    // Construtor
    public Tarefa(String titulo, String descricao) {
        this.id = contador; // incrementa e atribui automaticamente
        ++contador;
        this.titulo = titulo;
        this.descricao = descricao;
        this.completa = false; // por padrão, inicia como não concluída
        this.dataCriacao = LocalDateTime.now();
    }


    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }


    // Setters (somente atributos mutáveis)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
