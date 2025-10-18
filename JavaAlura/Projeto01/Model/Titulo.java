package JavaAlura.Projeto01.Model;

import JavaAlura.Projeto01.Exception.ErroConversao;
import JavaAlura.Projeto01.Model.TituloOMBD;

public class Titulo {
    private String nomeTitulo;
    private int anoLancamento;
    private int duracaoMinutos;

    public Titulo(){}

    public Titulo(String nomeTitulo, int anoLancamento){
        this.nomeTitulo = nomeTitulo;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOMBD nomeFilme){
        this.nomeTitulo = nomeFilme.title();

        if(nomeFilme.year().length() > 4 ){
            throw new ErroConversao("Formato do ano incorreto");
        }
        this.anoLancamento = Integer.valueOf(nomeFilme.year());

        String runtime = nomeFilme.runtime();
        if (runtime != null && runtime.contains(" ")) {
            this.duracaoMinutos = Integer.parseInt(runtime.split(" ")[0]);
        } else {
            this.duracaoMinutos = 0;
        }

    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    @Override
    public String toString() {
        return "(nome = " + nomeTitulo +
                ", anoDeLancamento = " + anoLancamento + "," + " duração = "+ duracaoMinutos + ")";
    }

}
