/**
 * Creates undergrad student
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-13-16
 */
public class UndergradStudent extends Student {
    protected int hope;
    protected int pizza;
    /**
     * Creates undergrad, everything from student
     * plus a hope percentage starting at 100
     * and decreasing to 0 at most
     * and also a pizza value for how much
     * pizza eaten
     * @param  name     [String]
     * @param  lastName [String]
     * @param  username [String]
     */
    public UndergradStudent(String name, String lastName, String username) {
        super(name, lastName, username);
        hope = 100;
        pizza = 0;
    }
    /**
     * Returns hope value
     * @return [int]
     */
    public int getHope() {
        return hope;
    }
    /**
     * Reduces hope by amount passed, cant go below 0
     * @param hopeLoss [int]
     */
    public void loseHope(int hopeLoss) {
        if (hopeLoss < 0 || hopeLoss > hope) {
            System.out.println("Invalid amount of hope to lose.");
        } else {
            hope = hope - hopeLoss;
        }
        if (hope == 0) {
            System.out.println("All hope is lost!!!!");
        }
    }
    /**
     * Returns amount of pizza eaten
     * @return [int]
     */
    public int getPizza() {
        return pizza;
    }
    /**
     * Adds int amount of pizzas to amount eaten
     * @param pizzas [int]
     */
    public void eatPizza(int pizzas) {
        if (pizzas < 0) {
            System.out.println("Cannot eat negative pizzas.");
        } else {
            pizza = pizza + pizzas;
        }
    }
}