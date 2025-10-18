package JavaAlura.Projeto01.Exception;

public class ErroConversao extends RuntimeException {
    private String Mensagem;
    public ErroConversao(String Mensagem) {
        this.Mensagem = Mensagem;
    }
    @Override
    public String getMessage(){
        return this.Mensagem;
    }
}
