/**
 * acception class for unknown pokemon
 * being put in the pokedex
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-18-16
 */
public class UnknownPokemonException extends Exception {
    /**
     * Throws error when adding an unknown pokemon
     * from a journal
     */
    public UnknownPokemonException() {
        super();
    }
    /**
     * Allows for custume messages when
     * throwing this error
     * @param  message [any wanted string]
     */
    public UnknownPokemonException(String message) {
        super(message);
    }
}