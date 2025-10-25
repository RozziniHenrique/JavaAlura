package JavaAlura.Projeto02_BuscaFIPE.Controller;

import JavaAlura.Projeto02_BuscaFIPE.Model.Dados;
import JavaAlura.Projeto02_BuscaFIPE.Model.Modelos;
import JavaAlura.Projeto02_BuscaFIPE.Model.Veiculo;
import JavaAlura.Projeto02_BuscaFIPE.Service.BuscaAPI;
import JavaAlura.Projeto02_BuscaFIPE.Service.Converte;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Control {
    private Scanner Leitura = new Scanner(System.in);
    private BuscaAPI consumo = new BuscaAPI();
    private Converte conversor = new Converte();
    List<Veiculo> veiculos = new ArrayList<>();
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu(){
        var menu = """
                Qual tipo de veiculo deseja buscar?
                Carro
                Moto
                """;
        System.out.println(menu);
        var escolha = Leitura.nextLine();

        if(escolha.toLowerCase().contains("carro")){
            escolha = URL_BASE + "carros/marcas";
        } else if(escolha.toLowerCase().contains("moto")){
            escolha = URL_BASE + "motos/marcas";
        } else{
            System.out.println("Inválido");
        }

        var json = consumo.obterDados(escolha);
        var marcas = conversor.obterLista(json, Dados.class);
        marcas.stream().sorted(Comparator.comparing(Dados::nome))
                .forEach(System.out::println);

        System.out.println("Informe o código da marca que escolheu: ");
        var codMarca = Leitura.nextLine();

        escolha = escolha + "/" + codMarca + "/modelos";
        json = consumo.obterDados(escolha);
        var modeloLista = conversor.obterDados(json, Modelos.class);
        System.out.println("\n Modelos da marca ");
        modeloLista.modelos().stream()
                .sorted(Comparator.comparing(Dados::nome))
                .forEach(System.out::println);

        System.out.println("\n Digite o Carro");
        var nomeCarro = Leitura.nextLine();

        List<Dados> modeloBusca = modeloLista.modelos().stream()
                .filter(m -> m.nome().toLowerCase().contains(nomeCarro.toLowerCase()))
                .collect(Collectors.toList());
        System.out.println("\n Carros Buscados: ");
        modeloBusca.forEach(System.out::println);

        System.out.println("Codigo do modelo desejado: ");
        var codModelo = Leitura.nextLine();

        escolha = escolha + "/" + codModelo + "/anos";
        json = consumo.obterDados(escolha);

        List<Dados> anos = conversor.obterLista(json, Dados.class);

        for (int i = 0; i < anos.size() ; i++) {
            var escolhaAnos = escolha + "/" + anos.get(i).codigo();
            json = consumo.obterDados(escolhaAnos);
            Veiculo veiculo = conversor.obterDados(json, Veiculo.class);
            veiculos.add(veiculo);
            
        }
        System.out.println("\n Todos veiculos");
        veiculos.forEach(System.out::println);

    }
}
