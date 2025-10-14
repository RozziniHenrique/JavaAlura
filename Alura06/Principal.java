package JavaAlura.Alura06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    meuFilme.avalia(8);
    Filme outroFilme = new Filme("Avatar", 2023);
    outroFilme.avalia(10);
    Serie lost = new Serie("Lost", 2000);
    Serie friends = new Serie("Friends", 1994);

    ArrayList<Titulo> lista = new ArrayList<>();
    lista.add(meuFilme);
    lista.add(outroFilme);
    lista.add(lost);
    lista.add(friends);
    for (Titulo item: lista){ 
        System.out.println(item.getNome());
        if (item instanceof Filme filme) {
        System.out.println("Classificação: " + filme.getClassificacao());
        }

    }

    List<String> buscaArtista = new LinkedList<>();
    buscaArtista.add("Adam Sandler");
    buscaArtista.add("Henrique");
    buscaArtista.add("Mafe");
    buscaArtista.add("Ana");

    Collections.sort(buscaArtista);
    //System.out.println(buscaArtista);

    Collections.sort(lista);
    System.out.println(lista);
    lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
    System.out.println("Ordenado por ano de lançamento: " + lista);
}
}

