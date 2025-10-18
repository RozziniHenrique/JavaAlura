package JavaAlura.AluraCurso01.Alura02Desafio;

import java.util.ArrayList;

public class Desafio02Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("Ana", 30));
        listaDePessoas.add(new Pessoa("Clara", 25));
        listaDePessoas.add(new Pessoa("Mafe", 28));

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista completa de pessoas: ");
        for(Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
