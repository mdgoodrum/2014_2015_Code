/**
 * Abstract Pokemon class
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-15-16
 */
public abstract class Pokemon implements Comparable<Pokemon> {
    private int level;
    private int currentHealth;
    private int maxHealth;
    private int speed;
    /**
     * Creates a pokemon with a level,
     * max health, speed and current health
     * @param  level     [int [1, 100]]
     * @param  maxHealth [int [1, 500]]
     * @param  speed     [int [1, 180]]
     */
    public Pokemon(int level, int maxHealth, int speed) {
        setLevel(level);
        setMaxHealth(maxHealth);
        setSpeed(speed);
        currentHealth = maxHealth;
    }
    /**
     * Abstract method to be defined in subclasses
     * defines how each pokemon attack (how much dammage it does)
     * @param other [attacked pokemon]
     */
    public abstract void attack(Pokemon other);
    /**
     * Compares to pokemon, if level, max heatlth
     * and speed are all equal return true, else false
     * @param  other [other pokemon]
     * @return       [boolean]
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        Pokemon otherPokemon = (Pokemon) other;
        return (otherPokemon.level == this.level)
            && (otherPokemon.maxHealth == this.maxHealth)
            && (otherPokemon.speed == this.speed);
    }
    /**
     * Compare to method, compares level first
     * if equal then max health, if equal then speed
     * if all 3 = 0 then return 0
     * else regular compare to values for the first one
     * that differs
     * @param  other [other pokemon]
     * @return       [int]
     */
    public int compareTo(Pokemon other) {
        if (other.level == this.level) {
            if (other.maxHealth == this.maxHealth) {
                return this.speed - other.speed;
            } else {
                return this.maxHealth - other.maxHealth;
            }
        } else {
            return this.level - other.level;
        }
    }
    /**
     * Override
     * @return [int]
     */
    public int hashCode() {
        int hash;
        hash = (int) ((level + maxHealth + speed) / 11);
        return hash;
    }
    /**
     * Returns level
     * @return [int]
     */
    public int getLevel() {
        return level;
    }
    /**
     * Returns max health
     * @return [int]
     */
    public int getMaxHealth() {
        return maxHealth;
    }
    /**
     * Returns current health
     * @return [int]
     */
    public int getCurrentHealth() {
        return currentHealth;
    }
    /**
     * Returns speed
     * @return [int]
     */
    public int getSpeed() {
        return speed;
    }
    /**
     * Sets level, throws acception
     * if not within allowed range
     * @param level [int [1, 100]]
     */
    public void setLevel(int level) {
        if (level < 1 || level > 100) {
            throw new IllegalArgumentException("Level must "
                + "be between 1 and 100.");
        } else {
            this.level = level;
        }
    }
    /**
     * Sets max health, throws acception
     * if not within allowe range
     * @param maxHealth [int [1, 500]]
     */
    public void setMaxHealth(int maxHealth) {
        if (maxHealth < 1 || level > 500) {
            throw new IllegalArgumentException("Max health must "
                + "be between 1 and 500.");
        } else {
            this.maxHealth = maxHealth;
        }
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }
    /**
     * Sets current health, throws acception
     * if not within range, if value is less than
     * 0 defaults to zero (pokemon fainted)
     * @param currentHealth [0, max health]
     */
    public void setCurrentHealth(int currentHealth) {
        if (currentHealth > maxHealth) {
            throw new IllegalArgumentException("Current health cannot "
                + "be more then max health.");
        }
        if (currentHealth <= 0) {
            this.currentHealth = 0;
        } else {
            this.currentHealth = currentHealth;
        }
    }
    /**
     * Sets speed, throws acception
     * if not within range
     * @param speed [int [1, 180]]
     */
    public void setSpeed(int speed) {
        if (speed < 1 || speed > 180) {
            throw new IllegalArgumentException("Speed must be "
                + "between 1 and 180.");
        } else {
            this.speed = speed;
        }
    }
}