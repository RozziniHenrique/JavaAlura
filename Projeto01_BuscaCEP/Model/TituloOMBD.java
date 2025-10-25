package JavaAlura.Projeto01_BuscaCEP.Model;

public record TituloOMBD(String title, String year, String runtime, String response, String error) {
    public String getMensagem() {
        return error;
    }
    public String getErro() {
        return response;
    }
}