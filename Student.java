/**
 * Creates a student
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-13-16
 */
public class Student extends Person {
    protected int studyHours;
    protected int nonStudyHours;
    /**
     * Constructs student with all the same info as person
     * also has added amount of hours sutdied
     * and hours not studdying during free time
     * @param  name     [string name]
     * @param  lastName [string last name]
     * @param  username [string user name]
     */
    public Student(String name, String lastName, String username) {
        super(name, lastName, username);
        studyHours = 0;
        nonStudyHours = 0;
    }
    /**
     * Returns amount of hours studied
     * during free time
     * @return [int]
     */
    public int getStudyHours() {
        return studyHours;
    }
    /**
     * Returns amount of time not studying
     * during free time
     * @return [int]
     */
    public int getNonStudyHours() {
        return nonStudyHours;
    }
    /**
     * Returns the percentage as a decimal of
     * hour many hours were spent studying
     * out of all the ours outside the classroom
     * @return [double]
     */
    public double getStudyPercentage() {
        if (nonStudyHours == 0) {
            return 1.0;
        } else {
            double percenting = (double) studyHours + nonStudyHours;
            percenting = studyHours / percenting;
            percenting = Math.round(percenting * 100);
            percenting = percenting / 100;
            return percenting;
        }
    }
    /**
     * Add int amount of hours to the
     * amount of time studying
     * @param hours [int]
     */
    public void study(int hours) {
        if (hours < 0) {
            System.out.println("Cannot study negative amount of hours.");
        } else {
            this.studyHours = studyHours + hours;
        }
    }
    /**
     * Adds int amount of hours to the amount
     * of time not studying
     * @param hours [int]
     */
    public void relax(int hours) {
        if (hours < 0) {
            System.out.println("Cannot relax negative amount of hours.");
        } else {
            this.nonStudyHours = nonStudyHours + hours;
        }
    }
}