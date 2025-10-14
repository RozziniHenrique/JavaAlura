package JavaAlura.Alura03;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int qtd, String dataValidade) {
        super(nome, preco, qtd);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Validade: " + this.dataValidade;
    }
}