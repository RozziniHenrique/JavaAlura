package JavaAlura.AluraCurso01.Alura05;

public class CartaoCredito {
    private String Produto;
    private double ValorProduto;
    private double SaldoCartao;

    public String getProduto() {
        return Produto;
    }
    public double getValorProduto() {
        return ValorProduto;
    }
    public double getSaldoCartao() {
        return SaldoCartao;
    }
    

    public CartaoCredito(String produto, double valorProduto) {
        this.Produto = produto;
        this.ValorProduto = valorProduto;
    }
    @Override
    public String toString() {
        return Produto + " - R$ " + ValorProduto;
    }
}
