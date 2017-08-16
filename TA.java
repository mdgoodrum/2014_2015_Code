/**
 * Creates a teachers assistant
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-13-16
 */
public class TA extends UndergradStudent {
    private double piazzaScore;
    private double recitationScore;
    private double officeHoursScore;
    /**
     * Creates TA with all features from an undergrad
     * but also has scores for piazza, recitation and office hours
     * @param  name             [String name]
     * @param  lastName         [String last name]
     * @param  username         [String user name]
     * @param  piazzaScore      [double [0,1]]
     * @param  recitationScore  [double [0,1]]
     * @param  officeHoursScore [double [0,1]]
     */
    public TA(String name, String lastName, String username,
        double piazzaScore, double recitationScore, double officeHoursScore) {
        super(name, lastName, username);
        if (piazzaScore < 0.0 || piazzaScore > 1.0) {
            System.out.println("Invalid piazza score."
                + " Input score between 0 and 1.");
            this.piazzaScore = 0.0;
        } else {
            this.piazzaScore = piazzaScore;
        }
        if (recitationScore < 0.0 || recitationScore > 1.0) {
            System.out.println("Invalid recitation score."
                + " Input score between 0 and 1.");
            this.recitationScore = 0.0;
        } else {
            this.recitationScore = recitationScore;
        }
        if (officeHoursScore < 0.0 || officeHoursScore > 1.0) {
            System.out.println("Invalid office hours score."
                + " Input score between 0 and 1.");
            this.officeHoursScore = 0.0;
        } else {
            this.officeHoursScore = officeHoursScore;
        }
    }
    /**
     * Returns piazza score
     * @return [double]
     */
    public double getPiazzaScore() {
        return piazzaScore;
    }
    /**
     * Returns recitation score
     * @return [double]
     */
    public double getRecitationScore() {
        return recitationScore;
    }
    /**
     * Returns office hour scores
     * @return [double]
     */
    public double getOfficeHoursScore() {
        return officeHoursScore;
    }
    /**
     * Sets piazza score
     * @param piazzaScore [double [0,1]]
     */
    public void setPiazzaScore(double piazzaScore) {
        if (piazzaScore <= 1.0 && piazzaScore >= 0.0) {
            this.piazzaScore = piazzaScore;
        } else {
            System.out.println("Invalid score.");
        }
    }
    /**
     * Sets recitation score
     * @param recitationScore [double [0,1]]
     */
    public void setRecitationScore(double recitationScore) {
        if (recitationScore <= 1.0 && recitationScore >= 0.0) {
            this.recitationScore = recitationScore;
        } else {
            System.out.println("Invalid score.");
        }
    }
    /**
     * Sets office hours score
     * @param officeHoursScore [double [0,1]]
     */
    public void setOfficeHoursScore(double officeHoursScore) {
        if (officeHoursScore <= 1.0 && officeHoursScore >= 0.0) {
            this.officeHoursScore = officeHoursScore;
        } else {
            System.out.println("Invalid score.");
        }
    }
}