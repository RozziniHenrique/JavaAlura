package JavaAlura.AluraCurso01.Alura01;

public class CalcularLivro implements CalcularPreco {
    private double preco;
    private double desconto;

    public CalcularLivro(double preco, double desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * desconto / 100);
    }
    
}
