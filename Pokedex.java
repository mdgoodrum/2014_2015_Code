import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.List;
/**
 * Class that creates a pokedex
 * that you can add pokemon to
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-18-16
 */
public class Pokedex {
    private List<Pokemon> captured;
    /**
     * Creates an empty pokedex
     */
    public Pokedex() {
        captured = new ArrayList<Pokemon>();
    }
    /**
     * Creates a podex with all the pokemon
     * from a txt file with all the pokemon
     * catalogued
     * @param  journal                 [txt file]
     * @throws UnknownPokemonException [Throws error if pokemon is unknown]
     */
    public Pokedex(String journal) throws UnknownPokemonException {
        this();
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream(journal));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
        String str = "";
        int counter = 0;
        while (fileIn.hasNextLine()) {
            str += fileIn.nextLine() + ",";
            counter++;
        }
        fileIn.close();
        str += "done";
        String[] array = new String[counter];
        array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        for (int x = 0; x < array.length - 1; x++) {
            if (array[x].equals("Pikachu")) {
                addPokemon(new Pikachu(Integer.valueOf(array[x + 1]),
                    Integer.valueOf(array[x + 2]),
                    Integer.valueOf(array[x + 3])));
                x += 3;
            } else if (array[x].equals("Ditto")) {
                addPokemon(new Ditto(Integer.valueOf(array[x + 1]),
                    Integer.valueOf(array[x + 2]),
                    Integer.valueOf(array[x + 3])));
                x += 3;
            } else if (array[x].equals("Magikarp")) {
                try {
                    double b = Double.parseDouble(array[x + 4]);
                    addPokemon(new Magikarp(Integer.valueOf(array[x + 1]),
                        Integer.valueOf(array[x + 2]),
                        Integer.valueOf(array[x + 3]),
                        Double.parseDouble(array[x + 4])));
                    x += 4;
                } catch (NumberFormatException e) {
                    addPokemon(new Magikarp(Integer.valueOf(array[x + 1]),
                        Integer.valueOf(array[x + 2]),
                        Integer.valueOf(array[x + 3])));
                    x += 3;
                }
            } else {
                throw new UnknownPokemonException("This pokedex can only handle"
                    + " Pikachu's, Ditto's and Magikarp's at the moment.");
            }
        }
    }
    /**
     * Adds pokemon the to pokedex
     * @param p [Pokemon]
     */
    public void addPokemon(Pokemon p) {
        captured.add(p);
    }
    /**
     * Sorts pokemon according to
     * compare to method
     */
    public void sort() {
        Collections.sort(captured);
    }
    /**
     * Generates a letter with a description
     * of all the pokemon you currently got
     * sent from me to recipient
     * @param recipient [receiver of the letter]
     */
    public void generateLetter(String recipient) {
        String text = "Dear " + recipient + ",\n"
            + "Check out all of the Pokemon I've caught!\n"
            + toString() + "Cheers,\nMichael Goodrum";
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream(recipient
                + ".txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        outputStream.print(text);
        outputStream.close();
    }
    /**
     * prints all the pokemon in the pokedex
     * @return [String]
     */
    public String toString() {
        String capturedStr = "";
        for (Pokemon x : captured) {
            capturedStr += x + "\n";
        }
        return capturedStr;
    }
}