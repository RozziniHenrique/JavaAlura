package JavaAlura.Projeto01_BuscaCEP.Model;

public class Serie extends Titulo{
    private int temporadasSerie;

    public Serie(String nomeTitulo, int anoLancamento){
        super(nomeTitulo, anoLancamento);
    }

    public void setTemporadasSerie(int temporadasSerie) {
        this.temporadasSerie = temporadasSerie;
    }

    public int getTemporadasSerie() {
        return temporadasSerie;
    }
    @Override
    public String toString(){
        return "Serie: " + this.getNomeTitulo() + " (" + this.getAnoLancamento() + ")";
    }
}
