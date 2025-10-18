package JavaAlura.AluraCurso01.Alura01Desafio;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public Podcast(){}

    public Podcast(String titulo, int duracao, String estilo, String apresentador, String descricao) {
        super(titulo, duracao, estilo);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void reproduzir(){
        System.out.println("Reproduzindo podcast: " + this.getTitulo() + " apresentado por " + this.apresentador);
    }

    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Apresentador: " + this.apresentador);
        System.out.println("Descrição: " + this.descricao);
    }
}
