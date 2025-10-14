package JavaAlura.Alura01Desafio;

public class MainDesafio {
    public static void main(String[] args) { {

        Musica musica1 = new Musica("Imagine", 183, "John Lennon", "Rock", "Imagine", 1);
        Podcast podcast1 = new Podcast("Tech Talk", 45, "Tecnologia", "Alice Smith", "Discussões sobre as últimas tendências em tecnologia.");

        musica1.reproduzir();
        musica1.curtir();
        musica1.mostrarDetalhes();

        System.out.println();

        podcast1.reproduzir();
        podcast1.curtir();
        podcast1.curtir();
        podcast1.mostrarDetalhes();
    }
    }
}
