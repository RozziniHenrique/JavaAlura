package JavaAlura.AluraCurso01.Alura01Desafio;

public class Musica extends Audio {
    private String artista;
    private String album;
    private int faixa;
    
    public Musica(){}

    public Musica(String titulo, int duracao,String estilo, String artista, String album, int faixa) {
        super(titulo, duracao, estilo);
        this.artista = artista;
        this.album = album;
        this.faixa = faixa;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public int getFaixa() {
        return faixa;
    }
    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void reproduzir(){
        System.out.println("Reproduzindo música: " + this.getTitulo() + " do álbum " + this.album);
    }

    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Artista: " + this.artista);
        System.out.println("Álbum: " + this.album);
        System.out.println("Faixa: " + this.faixa);
    }
    
}
