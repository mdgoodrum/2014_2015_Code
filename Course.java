/**
 * Creates course that you can add students to
 * @author Michael Goodrum
 * @version 1.0
 * @since  6-13-16
 */
public class Course {
    private String title;
    private Professor professor;
    private TA headTA;
    private TA[] tas;
    private Student[] students;
    /**
     * Creates the course with its title, the professor
     * the head TA, all the other TAs and all the students
     * @param  title     [String]
     * @param  professor [String]
     * @param  headTA    [TA]
     * @param  tas       [TA[] max 15]
     * @param  students  [Student[] max 300]
     */
    public Course(String title, Professor professor, TA headTA,
        TA[] tas, Student[] students) {
        this.title = title;
        this.professor = professor;
        this.headTA = headTA;
        if (tas.length > 15) {
            System.out.println("This class can only have 15 TA's not"
                + " counting the head TA.");
            this.tas = new TA[15];
        } else {
            this.tas = tas;
        }
        if (students.length > 300) {
            System.out.println("This class can only have 300 students at max.");
            this.students = new Student[300];
        } else {
            this.students = students;
        }
    }
    /**
     * Returns the title of the class
     * @return [String]
     */
    public String getTitle() {
        return title;
    }
    /**
     * Returns the professors name
     * @return [String]
     */
    public Professor getProfessor() {
        return professor;
    }
    /**
     * Returns the head TA
     * @return [TA]
     */
    public TA getHeadTA() {
        return headTA;
    }
    /**
     * Returnts all the other TAs
     * @return [TA[]]
     */
    public TA[] getTAs() {
        return tas;
    }
    /**
     * Returns the students
     * @return [Student[]]
     */
    public Student[] getStudents() {
        return students;
    }
    /**
     * Returns the average gpa of all the students
     * @return [description]
     */
    public double getAverageStudyPercentage() {
        int size = 0;
        double total = 0.0;
        double average = 0.0;
        for (Student x : students) {
            if (x != null) {
                size++;
                total += x.getStudyPercentage();
            }
        }
        average = Math.round((total / size) * 100);
        average = average / 100;
        return average;
    }
    /**
     * Adds one students to the roster, if there are
     * any nulls it adds it in the place of one of them
     * @param s [Student]
     */
    public void addStudent(Student s) {
        Student[] temp = new Student[students.length];
        Student[] temp2;
        int token = 0;
        int nulls = 0;
        for (int x = 0; x < students.length; x++) {
            if (students[x] != null) {
                temp[token] = students[x];
                token++;
            } else {
                nulls++;
            }
        }
        if (token > 299) {
            System.out.println("Sorry this class has reached its"
                + " limit of students.");
        } else if (nulls > 0) {
            for (int x = 0; x < students.length; x++) {
                if (temp[x] != null) {
                    temp[x] = s;
                    x = students.length;
                    students = temp;
                }
            }
        } else {
            temp2 = new Student[token + 1];
            for (int x = 0; x < temp.length; x++) {
                temp2[x] = temp[x];
            }
            temp2[temp.length] = s;
            students = temp2;
        }
    }
}