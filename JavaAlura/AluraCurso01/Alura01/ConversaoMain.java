package JavaAlura.AluraCurso01.Alura01;

public class ConversaoMain {
    public static void main(String[] args) {
        ConversaoMoeda conversor = new ConversaoMoeda();
        double valorDolar = 10.0; // Exemplo de valor em dólar
        double valorReal = conversor.converterDolarParaReal(valorDolar);
        System.out.println("Valor em Reais: R$ " + valorReal);
    }
}