package JavaAlura.Alura05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int controller = 0;
        List<CartaoCredito> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de compras");
        System.out.println("Digite o Saldo do seu cartão");
        double saldoCartao = scanner.nextDouble();
        System.out.println("Digite 1 para iniciar o carrinho ou 0 para finalizar");
        controller = scanner.nextInt();

        while ( controller != 0){
            scanner.nextLine();
            
            System.out.println("Digite o nome do produto");
            String produto = scanner.nextLine();
            
            System.out.println("Digite o valor do produto");
            double valorProduto = scanner.nextDouble();

            if(valorProduto <= saldoCartao){
                saldoCartao -= valorProduto;
                lista.add(new CartaoCredito(produto, valorProduto));
                System.out.println("Produto adicionado ao carrinho");
                System.out.println("Saldo restante: " + saldoCartao);
            }else{
                System.out.println("Saldo insuficiente para adicionar o produto ao carrinho");
                System.out.println("Saldo restante: " + saldoCartao);
                System.out.println("Digite 1 para adicionar mais produtos ou 0 para finalizar");
                controller = scanner.nextInt();
                continue;
            }
            
            System.out.println("Digite 1 para adicionar mais produtos ou 0 para finalizar");
            controller = scanner.nextInt();

        }

        lista.sort(Comparator.comparing(CartaoCredito::getValorProduto).reversed());

        System.out.println("Lista completa de compras ordenado por valor: ");
        System.out.println(lista);
        
    }
}