package JavaAlura.Projeto01.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TituloAPI {
    private final String API_BASE_URL = "https://www.omdbapi.com/?t=";
    private final String apiKey;

    public TituloAPI(String apiKey) {
        this.apiKey = apiKey;
    }

    public String buscarJsonPorTitulo(String titulo) throws IOException, InterruptedException {
        String tituloFormatado = titulo.replace(" ", "+");
        String url = API_BASE_URL + tituloFormatado + "&apikey=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Erro na requisição à API. Status: " + response.statusCode());
        }

        return response.body();
    }
}