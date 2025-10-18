package JavaAlura.Projeto01.Controller; // PACOTE ATUALIZADO

import JavaAlura.Projeto01.Exception.ErroConversao;
import JavaAlura.Projeto01.Model.Titulo;
import JavaAlura.Projeto01.Service.TituloAPI;
import JavaAlura.Projeto01.Service.TituloGson;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control {

    private final Gson gson;
    private final TituloAPI apiService;
    private final Scanner buscaFilme = new Scanner(System.in);
    private final List<Titulo> buscaTitulo = new ArrayList<>();
    private final List<Titulo> titulosBuscados = new ArrayList<>();

    public Control(Gson gson, TituloAPI apiService) {
        this.gson = gson;
        this.apiService = apiService;
    }

    public void executar() throws IOException, InterruptedException {
        String nomeFilme = "";

        while(!nomeFilme.equalsIgnoreCase("Sair")){
            System.out.println("Digite o nome do filme que deseja buscar (ou 'Sair'): ");
            nomeFilme = buscaFilme.nextLine();

            if(nomeFilme.equalsIgnoreCase("Sair")){
                break;
            }

            try {
                String json = apiService.buscarJsonPorTitulo(nomeFilme);

                Titulo meuTitulo = TituloGson.converterJsonParaTitulo(json, gson);

                System.out.println("Título encontrado: " + meuTitulo);
                titulosBuscados.add(meuTitulo);

            } catch (ErroConversao e) {
                System.out.println("[ERRO DE CONVERSÃO] " + e.getMessage());
            } catch (IOException | InterruptedException e) {
                System.out.println("[ERRO DE COMUNICAÇÃO] Ocorreu um problema com a requisição: " + e.getMessage());
            }
        }

        salvarTitulosEmArquivo();
    }

    private void salvarTitulosEmArquivo() {
        try (FileWriter escrita = new FileWriter("Titulos.json")) {
            escrita.write(gson.toJson(titulosBuscados));
            System.out.println("Arquivo 'Titulos.json' salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}