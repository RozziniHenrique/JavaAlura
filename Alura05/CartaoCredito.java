package JavaAlura.Alura05;

public class Compras {
    private String Produto;
    private double ValorProduto;
    private double SaldoCartao;

    public void setValorProduto(double ValorProduto) {
        this.ValorProduto = ValorProduto;
    }
    public String getValorProduto() {
        return String.valueOf(ValorProduto);
    }
    public void setProduto(String produto) {
        this.Produto = produto;
    }
    public double getValorProdutoDouble() {
        return ValorProduto;
    }

    public Compras(String produto, double ValorProduto) {
        Produto = produto;
        this.ValorProduto = ValorProduto;
    }
    public String getProduto() {
        return Produto;
    }

    @Override
    public String toString() {
        return Produto + " - R$ " + ValorProduto;
    }
}
