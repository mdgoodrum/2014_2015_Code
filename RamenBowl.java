/**
 * This class creates a Ramen Bowl
 * and stores the amount of packages
 * for each ingredient.
 * @author  Michael Goodrum
 * @version 1.0
 * @since  06-17-16
 */
public class RamenBowl {
    private double noodlePackages;
    private double vegetablePackages;
    private double porkPackages;
    /**
     * This creates a ramen bowl with the
     * specified amount of each of 3 ingredients
     * @param  noodlePackages      [quantity of noodles]
     * @param  vegetablePackages    [quantity of veggies]
     * @param  porkPackages [quantity of pork]
     */
    public RamenBowl(double noodlePackages, double vegetablePackages,
        double porkPackages) {
        this.noodlePackages = noodlePackages;
        this.vegetablePackages = vegetablePackages;
        this.porkPackages = porkPackages;
    }
    /**
     * This creates an empty Ramen bowl
     */
    public RamenBowl() {
        super();
    }
    /**
     * Prints the amount of each incredient in the bowl
     * if the bowl is empty returns "An empty bowl."
     * @return [String description]
     */
    public String toString() {
        if ((noodlePackages == 0) && (vegetablePackages == 0)
            && (porkPackages == 0)) {
            return "An empty bowl.";
        } else {
            return "Bowl contains " + noodlePackages + " packages of noddles, "
                + vegetablePackages + " packages of vegetables, and "
                + porkPackages + " packages of pork.";
        }
    }
}