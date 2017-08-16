/**
 * Creates a Ditto
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-16-16
 */
public class Ditto extends Pokemon {
    private Pokemon form;
    /**
     * Creates a Ditto in normal form
     * @param  level     [int [1, 100]]
     * @param  maxHealth [int [1, 500]]
     * @param  speed     [int [1, 180]]
     */
    public Ditto(int level, int maxHealth, int speed) {
        super(level, maxHealth, speed);
    }
    /**
     * Creates Ditto thats transformed
     * into another pokemon
     * @param  level     [int [1, 100]]
     * @param  maxHealth [int [1, 500]]
     * @param  speed     [int [1, 180]]
     * @param  form      [Pokemon]
     */
    public Ditto(int level, int maxHealth, int speed, Pokemon form) {
        this(level, maxHealth, speed);
        if (form != null) {
            transform(form);
        }
    }
    /**
     * Attacks other pokemon
     * if other is ditto do 1 damage
     * if not transformed into that pokemon
     * if already transformed into him attack
     * like pokemon you currently are trasnformed into
     * @param other [description]
     */
    public void attack(Pokemon other) {
        if (this.form == null) {
            if (other.getClass() == this.getClass()) {
                other.setCurrentHealth(other.getCurrentHealth() - 1);
            } else {
                transform(other);
            }
        } else {
            form.attack(other);
        }
    }
    /**
     * Transformes into target pokemon
     * Doesn't work if other is a ditto
     * @param other [Pokemon]
     */
    public void transform(Pokemon other) {
        if (other.getClass().equals(this.getClass())) {
            throw new IllegalArgumentException("Cannot transform "
                + "into a Ditto.");
        } else {
            form = other;
        }
    }
    /**
     * Same equals method from pokemon class
     * @param  other [Pokemon]
     * @return       [boolean]
     */
    public boolean equals(Object other) {
        return super.equals(other);
    }
    /**
     * /**
     * Override
     * @return [int]
     */
    public int hashCode() {
        return super.hashCode();
    }
    /**
     * Prints out ditto followed by its stats
     * @return [description]
     */
    public String toString() {
        return "Ditto level:" + getLevel() + " HP:"
            + getCurrentHealth() + "/" + getMaxHealth()
            + " Speed:" + getSpeed();
    }
}