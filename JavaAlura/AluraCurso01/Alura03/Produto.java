package JavaAlura.AluraCurso01.Alura03;

public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public Produto(){}

    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public String toString(){
        return "Produto " + this.nome + ", Preço: " + this.preco + ", Quantidade: " + this.qtd;
    }
}

/*
Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
 Crie um objeto ProdutoPerecivel e imprima seus valores.
 */
