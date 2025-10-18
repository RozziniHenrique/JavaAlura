package JavaAlura.AluraCurso01.Alura01;

public class CalcularProduto implements CalcularPreco {
    private double preco;
    private double taxa;

    public CalcularProduto(double preco, double taxa) {
        this.preco = preco;
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + (preco * taxa / 100);
    }

    
}
