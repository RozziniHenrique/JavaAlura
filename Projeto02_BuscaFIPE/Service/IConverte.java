package JavaAlura.Projeto02_BuscaFIPE.Service;

import java.util.List;

public interface IConverte {
    <T> T obterDados(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe);
}
