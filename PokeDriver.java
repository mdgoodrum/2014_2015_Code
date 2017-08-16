public class PokeDriver {
    public static void main(String[] args) throws UnknownPokemonException {
        Pokemon pikaPika = new Pikachu(5, 32, 15);
        System.out.println(pikaPika);
        Pokemon magi = new Magikarp(30, 14, 45, 0.34542);
        System.out.println(magi);
        Ditto dito = new Ditto(40, 20, 15);
        Ditto dito2 = new Ditto(30, 40, 12);
        Pokemon pika2 = new Pikachu(2, 40, 2);
        Pokemon magi2 = new Magikarp(5, 10, 4);
        pikaPika.attack(magi);
        System.out.println(magi);
        dito.attack(pika2);
        System.out.println(pika2);
        System.out.println(dito);
        dito.attack(pika2);
        System.out.println(pika2);
        Pokedex pokedex = new Pokedex("UPEjournal.txt");
    }
}