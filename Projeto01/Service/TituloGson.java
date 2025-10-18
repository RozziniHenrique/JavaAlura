package JavaAlura.Projeto01.Service;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class TituloGson {
    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
    String Json = response.body();
    TituloOMBD Titulo = gson.fromJson(Json, TituloGson.class);
}
