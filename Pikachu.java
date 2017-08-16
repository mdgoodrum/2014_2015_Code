import java.util.Random;
/**
 * Class that Creates a pikachu
 * @author Michael Goodrum
 * @version 1.0
 * @since  7-16-16
 */
public class Pikachu extends Pokemon {
    /**
     * Creates a pikachu with level, max health
     * speed and current health.
     * Current health equals max health
     * at time the pokemon is created
     * @param  level     [int [1, 100]]
     * @param  maxHealth [int [1, 500]]
     * @param  speed     [int [1, 180]]
     */
    public Pikachu(int level, int maxHealth, int speed) {
        super(level, maxHealth, speed);
    }
    /**
     * attack other pokemon, damage is between 0
     * and the level of the pikachu.
     * @param other [Pokemon attacked]
     */
    public void attack(Pokemon other) {
        Random random = new Random();
        int damage = random.nextInt(getLevel() + 1);
        other.setCurrentHealth(other.getCurrentHealth() - damage);
    }
    /**
     * Compares this pikachu to another
     * uses pokemon equals method
     * @param  other [Pokemon]
     * @return       [boolean]
     */
    public boolean equals(Object other) {
        return super.equals(other);
    }
    /**
     * Override
     * @return [int]
     */
    public int hashCode() {
        return super.hashCode();
    }
    /**
     * Prints out pikachu followed by its stats
     * @return [description]
     */
    public String toString() {
        return "Pikachu level:" + getLevel() + " HP:"
            + getCurrentHealth() + "/" + getMaxHealth()
            + " Speed:" + getSpeed();
    }
}