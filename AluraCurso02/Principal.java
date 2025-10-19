package JavaAlura.AluraCurso02;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um CEP");
        var cep = leitura.nextLine();

        BuscadorCEP Cep1 = new BuscadorCEP();

        try{
            Endereco novoEndereco = BuscadorCEP.buscaCEP(cep);
            System.out.println("Endereço: " + novoEndereco.logradouro() + ", " + novoEndereco.localidade());
            BuscadosCEP gerador = new BuscadosCEP();
            gerador.salvaJson(novoEndereco);
        } catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }

    }
}
