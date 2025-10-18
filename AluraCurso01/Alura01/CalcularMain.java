package JavaAlura.AluraCurso01.Alura01;

public class CalcularMain {
    public static void main(String[] args) {
        CalcularPreco livro = new CalcularLivro(100.0, 10.0); // Preço: 100, Desconto: 10%
        CalcularPreco produto = new CalcularProduto(200.0, 15.0); // Preço: 200, Taxa: 15%

        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: " + produto.calcularPrecoFinal());
    }
    
}
