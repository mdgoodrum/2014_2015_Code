/**
 * Professor class
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-13-16
 */
public class Professor extends Person {
    private double funnyFactor;
    private double gpa;
    private String errorGpa = "Please input valid gpa, must be between 0 and 4";
    private String errorFunnyFactor =
        "Please intput valid funny factor, must be between 0 and 1";
        /**
         * Creates professor with all features from person
         * but also a funny factor and an
         * average gpa
         * @param  name        [String]
         * @param  lastName    [String]
         * @param  username    [String]
         * @param  funnyFactor [String]
         * @param  gpa         [String]
         */
    public Professor(String name, String lastName, String username,
        double funnyFactor, double gpa) {
        super(name, lastName, username);
        if (funnyFactor < 0.0 || funnyFactor > 1.0) {
            System.out.println(errorFunnyFactor);
            this.funnyFactor = 0.0;
        } else {
            this.funnyFactor = funnyFactor;
        }
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println(errorGpa);
            this.gpa = 0.0;
        } else {
            this.gpa = gpa;
        }
    }
    /**
     * Returns gpa
     * @return [double]
     */
    public double getGPA() {
        return gpa;
    }
    /**
     * Returns funny factor
     * @return [double]
     */
    public double getFunnyFactor() {
        return funnyFactor;
    }
    /**
     * Sets Gpa, cant be negative or over 4.0
     * @param setGpa [double]
     */
    public void setGPA(double setGpa) {
        if ((setGpa <= 4.0) && (setGpa >= 0.0)) {
            this.gpa = setGpa;
        } else {
            System.out.println(errorGpa);
        }
    }
    /**
     * Sets funny factor, cant be negative or over 1
     * @param setFunnyFactor [double]
     */
    public void setFunnyFactor(double setFunnyFactor) {
        if (setFunnyFactor > 1.0 || setFunnyFactor < 0.0) {
            System.out.println(errorFunnyFactor);
        } else {
            this.funnyFactor = setFunnyFactor;
        }
    }
}