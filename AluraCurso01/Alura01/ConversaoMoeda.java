package JavaAlura.AluraCurso01.Alura01;

public class ConversaoMoeda implements ConversaoFinanceira {
    private static final double TAXA_CONVERSAO = 5.0;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * TAXA_CONVERSAO;
    }
}
