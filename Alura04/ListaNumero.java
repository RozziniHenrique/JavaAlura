package JavaAlura.Alura04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumero {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            numeros.add(randomNumber());
        }

        Collections.sort(numeros);
        System.out.println(numeros);
    }

    private static String randomNumber() {
        int numero = (int) (Math.random() * 100);
        return String.valueOf(numero);
    }
}
