package JavaAlura.Projeto01.Model;

public class Filme extends Titulo{
    private String diretorFilme;

    public Filme(String nomeTitulo, int anoLancamento){
        super(nomeTitulo, anoLancamento);
    }
    public String getDiretorFilme(){
        return diretorFilme;
    }
    @Override
    public String toString() {
        return "filme: " + this.getNomeTitulo() + " (" + this.getAnoLancamento() + ")";
    }
}