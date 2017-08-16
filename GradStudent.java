/**
 * Creates grad student
 * can't relax, just study
 * @author Michael Goodrum
 * @since  7-13-16
 * @version 1.0
 */
public class GradStudent extends Student {
    /**
     * [Grad student with name last name and username]
     * @param  name     [String name]
     * @param  lastName [String last name]
     * @param  username [String username]
     */
    public GradStudent(String name, String lastName, String username) {
        super(name, lastName, username);
        studyHours = getStudyHours();
    }
    /**
     * Makes sure the student cant relax
     * @param hours [Doesnt matter input, does nothing]
     */
    public final void relax(int hours) {
    }
}