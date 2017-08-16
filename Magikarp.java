import java.util.Random;
/**
 * Creates a magikarp
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-16-16
 */
public class Magikarp extends Pokemon {
    private double luck;
    /**
     * Creates magikarp with
     * all features of a pokemon
     * plus a luck factor that is set
     * to 0.15 if not specified in
     * constructor
     * @param  level     [int [1, 100]]
     * @param  maxHealth [int [1, 500]]
     * @param  speed     [int [1, 180]]
     */
    public Magikarp(int level, int maxHealth, int speed) {
        super(level, maxHealth, speed);
        luck = 0.15;
    }
    /**
     * Creates magikarp with specific luck
     * @param  level     [int [1, 100]]
     * @param  maxHealth [int [1, 500]]
     * @param  speed     [int [1, 180]]
     * @param  luck      [double [0, 1]]
     */
    public Magikarp(int level, int maxHealth, int speed, double luck) {
        this(level, maxHealth, speed);
        setLuck(luck);
    }
    /**
     * Attacks other pokemon
     * either kills em or does nothing
     * luck factor decides
     * @param other [attacked pokemon]
     */
    public void attack(Pokemon other) {
        Random random = new Random();
        double lucky = random.nextDouble();
        if (luck < lucky) {
            other.setCurrentHealth(0);
        }
    }
    /**
     * Same equals method from pokemon
     * @param  other [compared to pokemon]
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
     * Prints out magikarp followed by its stats
     * @return [description]
     */
    public String toString() {
        return String.format("Magikarp level:" + getLevel() + " HP:"
            + getCurrentHealth() + "/" + getMaxHealth()
            + " Speed:" + getSpeed() + " Luck:" + "%.2f", getLuck());
    }
    /**
     * Returns luck
     * @return [double]
     */
    public double getLuck() {
        return luck;
    }
    /**
     * Sets luck factor, throws error
     * if outside of range
     * @param luck [double]
     */
    public void setLuck(double luck) {
        if (luck < 0.0 || luck > 1.0) {
            throw new IllegalArgumentException("Luck can only be "
                + "between 0 and 1");
        } else {
            this.luck = luck;
        }
    }
}
