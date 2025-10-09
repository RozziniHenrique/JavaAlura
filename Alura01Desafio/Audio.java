package JavaAlura.Alura01Desafio;

public class Audio {
    private String titulo;
    private int duracao; //Em segundos.
    private String estilo;
    private int reproducoes;
    private int curtidas;

    public Audio(){}

    public Audio(String titulo, int duracao, String estilo) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.estilo = estilo;
        this.curtidas = 0;
        this.reproducoes = 0;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public int getReproducoes() {
        return reproducoes;
    }  
    
    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo áudio: " + this.titulo);
        this.reproducoes++;
    }

    public void mostrarDetalhes(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Duração: " + this.duracao + " segundos");
        System.out.println("Estilo: " + this.estilo);
        System.out.println("Curtidas: " + this.curtidas);
    }

}
