package JavaAlura.Projeto01.Main;

import JavaAlura.Projeto01.Controller.Control;
import JavaAlura.Projeto01.Service.TituloAPI;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class Principal {

    private static final String API_KEY = "d30a8ce";
    private static final Gson GSON = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public static void main(String[] args) throws IOException, InterruptedException {

        TituloAPI apiService = new TituloAPI(API_KEY);

        Control controlador = new Control(GSON, apiService);

        controlador.executar();

    }
}