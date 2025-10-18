package JavaAlura.AluraCurso01.Alura03;
import java.util.ArrayList;

public class Alura03Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Arroz", 20.0, 5));
        listaProdutos.add(new Produto("Feijão", 8.0, 10));
        listaProdutos.add(new Produto("Macarrão", 6.0, 15));
        listaProdutos.add(new ProdutoPerecivel("Leite", 4.5, 20, "09/10/2024"));

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto no índice 1: " + listaProdutos.get(0));
        System.out.println("Lista de Produtos:");
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
        

    }
}
