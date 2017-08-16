/**
 * Driver to test everything
 * @author Michael Goodrum
 * @version 1.0
 * @since 7-13-16
 */
public class Driver {
    private static TA[] tizles;
    private static Student[] st;
    /**
     * Main method in tester
     * @param args [none]
     */
    public static void main(String[] args) {
        Professor buga = new Professor("Buga", "Luga", "Bluga3", 0.5, 3.5);
        System.out.println(buga.getFirstName()); // Buga
        System.out.println(buga.getLastName()); // Luga
        System.out.println(buga.getUsername()); // Bluga3
        System.out.println(buga.getGPA()); // 3.5
        System.out.println(buga.getFunnyFactor()); // 0.5
        buga.setGPA(10); // invalid
        buga.setGPA(-4); // invalid
        System.out.println(buga.getGPA()); // 3.5
        buga.setFunnyFactor(-5.0); // invalid
        buga.setFunnyFactor(3); // invalid
        buga.setFunnyFactor(0.3);
        System.out.println(buga.getFunnyFactor()); // 0.3
        Student michael = new Student("Michael", "Goodrum", "mgoodrum3");
        michael.study(3);
        michael.relax(4);
        System.out.println(michael.getStudyHours()); //3
        System.out.println(michael.getNonStudyHours()); //4
        System.out.println(michael.getStudyPercentage()); // 0.43
        GradStudent alex = new GradStudent("Alex", "Hoyer", "ahoyer5");
        alex.study(3);
        alex.relax(3); // doesn't do anything
        System.out.println(alex.getNonStudyHours()); //0
        UndergradStudent joel = new UndergradStudent("Joel",
            "Goodrum", "jgoodrum");
        System.out.println(joel.getHope()); // 100
        joel.loseHope(10); //set to 90
        System.out.println(joel.getHope()); // 90
        joel.loseHope(90); // all hope lost
        joel.loseHope(2); // no more hope to be lost
        joel.eatPizza(30);
        System.out.println(joel.getPizza()); // 30
        TA harsh = new TA("Harsh", "Patel", "hp2004", 0.2, 0.3, 0.4);
        System.out.println(harsh.getPiazzaScore()); // 0.2
        System.out.println(harsh.getRecitationScore()); // 0.3
        System.out.println(harsh.getOfficeHoursScore()); // 0.4
        harsh.setPiazzaScore(0.3);
        harsh.setRecitationScore(0.1);
        harsh.setOfficeHoursScore(2); // invalid score
        System.out.println(harsh.getOfficeHoursScore()); // still 0.4
        st = new Student[299];
        tizles = new TA[15];
        for (int x = 0; x < 15; x++) {
            tizles[x] = new TA("TA", String.valueOf(x), "ta" + x, 0
                + (x / 10000.0), 0 + (x / 10000.0), 0 + (x / 10000.0));
        }
        for (int x = 0; x < 299; x++) {
            st[x] = new Student("student", String.valueOf(x), "st" + x);
            st[x].study(x);
            st[x].relax(x + 20);
        }
        Course cs1331 = new Course("cs1331", buga, harsh, tizles, st);
        System.out.println(cs1331.getTitle()); // cs1331
        System.out.println(cs1331.getProfessor()); // only returns reference
        System.out.println(cs1331.getHeadTA()); // only returns reference
        System.out.println(cs1331.getTAs()); // only returns reference
        System.out.println(cs1331.getStudents()); // only returns reference
        System.out.println(cs1331.getAverageStudyPercentage()); // 0.44
        System.out.println(cs1331.getStudents().length); // 299
        cs1331.addStudent(joel);
        System.out.println(cs1331.getStudents().length); // 300
        cs1331.addStudent(alex); // reached limit

    }
}