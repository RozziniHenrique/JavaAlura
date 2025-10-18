package JavaAlura.AluraCurso01.Alura06;

import JavaAlura.AluraCurso01.Alura06.Exception.erroDeConversão;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner busca = new Scanner(System.in);
        String nomeDoFilme = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!nomeDoFilme.equalsIgnoreCase("Sair")) {
            System.out.println("Digite o nome do filme que deseja buscar: ");
            nomeDoFilme = busca.nextLine();
            if (nomeDoFilme.equalsIgnoreCase("sair")) {
                break;
            }

            String URL = "https://www.omdbapi.com/?t=" + nomeDoFilme.replace(" ", "+") + "&apikey=d30a8ce";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(URL))
                        .build();
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
                String Json = response.body();
                System.out.println(Json);

                TituloOMBD meuTituloOMBD = gson.fromJson(Json, TituloOMBD.class);
                System.out.println(meuTituloOMBD);

                Titulo meuTitulo = new Titulo(meuTituloOMBD);
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Erro inesperado");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro inesperado");
                System.out.println(e.getMessage());
            } catch (erroDeConversão e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("Titulos.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
    }
}
