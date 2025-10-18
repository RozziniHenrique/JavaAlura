package JavaAlura.AluraCurso01.Alura06.Exception;

public class erroDeConversão extends RuntimeException {
    private String Mensagem;
    public erroDeConversão(String Mensagem) {
        this.Mensagem = Mensagem;
    }
    @Override
    public String getMessage(){
        return this.Mensagem;
    }
}
