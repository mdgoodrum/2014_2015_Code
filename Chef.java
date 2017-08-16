/**
 * Chef class, creates 3 possible kinds of chefs
 * and each has their own cook methods according
 * to what ingredients they use.
 * @author Michael Goodrum
 * @version 1.0
 * @since 06-18-16
 */
public class Chef {
    private String name;
    private double numOfNoodlesAvailable;
    private double numOfVeggiesAvailable;
    private double numOfPorkAvailable;
    private int bowlsMade = 0;
    private static int totalMade = 0;
    private static final double STANDARD_VEGGIES = 0.0;
    private static final double STANDARD_PORK = 0.0;
    private static final double STANDARD_STOCK = 0.0;
    /**
     * Creates the noodle chef
     * @param  name                  [Chefs name]
     * @param  numOfNoodlesAvailable [How many packs of noodles he has]
     */
    public Chef(String name, double numOfNoodlesAvailable) {
        this(name, numOfNoodlesAvailable, STANDARD_VEGGIES);
    }
    /**
     * Creates the veggie chef
     * @param  name                  [Chef's name]
     * @param  numOfNoodlesAvailable [How many packs of noodles he has]
     * @param  numOfVeggiesAvailable [How many packs of veggies he has]
     */
    public Chef(String name, double numOfNoodlesAvailable,
        double numOfVeggiesAvailable) {
        this(name, numOfNoodlesAvailable, numOfVeggiesAvailable, STANDARD_PORK);
    }
    /**
     * Creates the combo chef
     * @param  name                  [Chef's name]
     * @param  numOfNoodlesAvailable [How many packs of noodles he has]
     * @param  numOfVeggiesAvailable [How many packs of veggies he has]
     * @param  numOfPorkAvailable    [How many packs of pork he has]
     */
    public Chef(String name, double numOfNoodlesAvailable,
        double numOfVeggiesAvailable, double numOfPorkAvailable) {
        this.name = name;
        this.numOfNoodlesAvailable = numOfNoodlesAvailable;
        this.numOfVeggiesAvailable = numOfVeggiesAvailable;
        this.numOfPorkAvailable = numOfPorkAvailable;
        bowlsMade = 0;
    }
    /**
     * Cook method for noodle chef, if ingredients are available makes bowl
     * if not returns empty bowl.
     * @param cook1 [Consumes this amount of noodles if available]
     */
    public void cook(double cook1) {
        this.cook(cook1, STANDARD_STOCK);
    }
    /**
     * Cook method for veggie chef, if ingredients are available makes bowl
     * if not returns empty bowl.
     * @param cook1 [Consumes this amount of noodles if available]
     * @param cook2 [Consumes this amount of veggies if available]
     */
    public void cook(double cook1, double cook2) {
        this.cook(cook1, cook2, STANDARD_STOCK);
    }
    /**
     * Cook method for combo chef, if ingredients are available makes bowl
     * if not returns empty bowl.
     * @param cook1 [Consumes this amount of noodles if available]
     * @param cook2 [Consumes this amount of veggies if available]
     * @param cook3    [Consumes this amount of pork if available]
     */
    public void cook(double cook1, double cook2,
        double cook3) {
        if ((numOfNoodlesAvailable - cook1 < 0)
            || (numOfVeggiesAvailable - cook2 < 0)
            || (numOfPorkAvailable - cook3 < 0)) {
            RamenBowl cook = new RamenBowl();
        } else {
            RamenBowl cook = new RamenBowl(cook1, cook2, cook3);
            numOfNoodlesAvailable = numOfNoodlesAvailable - cook1;
            numOfVeggiesAvailable = numOfVeggiesAvailable - cook2;
            numOfPorkAvailable = numOfPorkAvailable - cook3;
            bowlsMade = bowlsMade + 1;
            totalMade = totalMade + 1;
        }
    }
    /**
     * Restocks respective chefs amount of ingredientes
     * @param restock1 [Increments noodle supply]
     * @param restock2 [Increments veggie supply]
     * @param restock3    [Increments pork supply]
     */
    public void restock(double restock1, double restock2,
        double restock3) {
        numOfNoodlesAvailable = numOfNoodlesAvailable + restock1;
        numOfVeggiesAvailable = numOfVeggiesAvailable + restock2;
        numOfPorkAvailable = numOfPorkAvailable + restock3;
    }
    /**
     * Returns total amount of bowls made for the whole shift
     * @return [integer with bowls made of all three chefs combined]
     */
    public static int totalMade() {
        return totalMade;
    }
    /**
     * Overrides to String
     * @return [Prints chef's name, how many bowls of ramen he has cooked
     * and how many packs of each ingredient he has left.]
     */
    public String toString() {
        return String.format("Chef " + name + " has cooked " + bowlsMade
            + " bowl(s) of ramen"
        + ", and has %.1f packs of noodles,\n%.1f packs of vegetables, "
        + "and %.1f packs of pork leftover.", numOfNoodlesAvailable,
        numOfVeggiesAvailable, numOfPorkAvailable);
    }
}