package JavaAlura.Projeto02_BuscaFIPE.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class Converte implements IConverte{
    private Gson gson = new Gson();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return gson.fromJson(json, classe);
    }

    @Override
    public <T> List<T> obterLista(String json, Class<T> classe) {
        Type listaType = TypeToken.getParameterized(List.class, classe).getType();
        return gson.fromJson(json, listaType);
    }
}
