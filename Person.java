/**
 * Creates the abstract class person
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-13-16
 */
public abstract class Person {
    private String name;
    private String lastName;
    private String username;
    /**
     * Creates person with name, last name
     * and username
     * @param  name     [String]
     * @param  lastName [String]
     * @param  username [String]
     */
    public Person(String name, String lastName, String username) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
    }
    /**
     * Returns name of person
     * @return [String]
     */
    public String getFirstName() {
        return name;
    }
    /**
     * Returns last name of person
     * @return [String]
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Returns user name of person
     * @return [String]
     */
    public String getUsername() {
        return username;
    }
}