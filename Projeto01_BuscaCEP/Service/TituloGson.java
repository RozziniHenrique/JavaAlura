package JavaAlura.Projeto01_BuscaCEP.Service;

import JavaAlura.Projeto01_BuscaCEP.Exception.ErroConversao;
import JavaAlura.Projeto01_BuscaCEP.Model.TituloOMBD;
import JavaAlura.Projeto01_BuscaCEP.Model.Titulo;
import com.google.gson.Gson;

public class TituloGson {

    public static Titulo converterJsonParaTitulo(String json, Gson gson) throws ErroConversao {
        try {
            TituloOMBD meuTituloOMBD = gson.fromJson(json, TituloOMBD.class);

            if ("False".equalsIgnoreCase(meuTituloOMBD.getErro())) {
                throw new ErroConversao("Título não encontrado ou erro na API: " + meuTituloOMBD.getMensagem());
            }

            Titulo meuTitulo = new Titulo(meuTituloOMBD);
            return meuTitulo;

        } catch (NumberFormatException e) {
            throw new ErroConversao("Erro de formato de número na conversão do JSON: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new ErroConversao("Erro de argumento na conversão do JSON: " + e.getMessage());
        }
    }
}