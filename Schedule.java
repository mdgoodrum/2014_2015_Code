/* Name: Michael Goodrum
Class: CS 1331
date 05/25/16
The goal of this program is to take user unput for 4 classes,
User will input class name, building, classroom, hours and grade.
After receiving input program will print a grid organizing all the information.
At the bottom of the grid will be displayed
the weighed GPA to a two-decimal point accuracy.
*/

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Course 1 Name: ");
        String course1 = scan.nextLine();
        System.out.println("Enter Course 1 Building: ");
        String building1 = scan.nextLine();
        System.out.println("Enter Course 1 Room: ");
        String room1 = scan.nextLine();
        System.out.println("Enter Course 1 Hours: ");
        int course1h = scan.nextInt();
        System.out.println("Enter Course 1 Grade: ");
        int course1g = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Course 2 Name: ");
        String course2 = scan.nextLine();
        System.out.println("Enter Course 2 Building: ");
        String building2 = scan.nextLine();
        System.out.println("Enter Course 2 Room: ");
        String room2 = scan.nextLine();
        System.out.println("Enter Course 2 Hours: ");
        int course2h = scan.nextInt();
        System.out.println("Enter Course 2 Grade: ");
        int course2g = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Course 3 Name: ");
        String course3 = scan.nextLine();
        System.out.println("Enter Course 3 Building: ");
        String building3 = scan.nextLine();
        System.out.println("Enter Course 3 Room: ");
        String room3 = scan.nextLine();
        System.out.println("Enter Course 3 Hours: ");
        int course3h = scan.nextInt();
        System.out.println("Enter Course 3 Grade: ");
        int course3g = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Course 4 Name: ");
        String course4 = scan.nextLine();
        System.out.println("Enter Course 4 Building: ");
        String building4 = scan.nextLine();
        System.out.println("Enter Course 4 Room: ");
        String room4 = scan.nextLine();
        System.out.println("Enter Course 4 Hours: ");
        int course4h = scan.nextInt();
        System.out.println("Enter Course 4 Grade: ");
        int course4g = scan.nextInt();
        System.out.print("------------------------");
        System.out.println("--------------------------------");
        System.out.print("|Course    |Building  |Room      ");
        System.out.println("|Hours     |Grade     |");
        System.out.print("----------------------------");
        System.out.println("----------------------------");
        System.out.print("|");
        System.out.printf("%10s", course1);
        System.out.print("|");
        System.out.printf("%10s", building1);
        System.out.print("|");
        System.out.printf("%10s", room1);
        System.out.print("|");
        System.out.printf("%10d", course1h);
        System.out.print("|");
        System.out.printf("%10d", course1g);
        System.out.println("|");
        System.out.print("|");
        System.out.printf("%10s", course2);
        System.out.print("|");
        System.out.printf("%10s", building2);
        System.out.print("|");
        System.out.printf("%10s", room2);
        System.out.print("|");
        System.out.printf("%10d", course2h);
        System.out.print("|");
        System.out.printf("%10d", course2g);
        System.out.println("|");
        System.out.print("|");
        System.out.printf("%10s", course3);
        System.out.print("|");
        System.out.printf("%10s", building3);
        System.out.print("|");
        System.out.printf("%10s", room3);
        System.out.print("|");
        System.out.printf("%10d", course3h);
        System.out.print("|");
        System.out.printf("%10d", course3g);
        System.out.println("|");
        System.out.print("|");
        System.out.printf("%10s", course4);
        System.out.print("|");
        System.out.printf("%10s", building4);
        System.out.print("|");
        System.out.printf("%10s", room4);
        System.out.print("|");
        System.out.printf("%10d", course4h);
        System.out.print("|");
        System.out.printf("%10d", course4g);
        System.out.println("|");
        System.out.print("---------------------------");
        System.out.println("-----------------------------");
        double hourstotal = course1h + course2h + course3h + course4h + 0.0;
        int course1c = course1h * course1g;
        int course2c = course2h * course2g;
        int course3c = course3h * course3g;
        int course4c = course4h * course4g;
        int myCredits = (course1c + course2c + course3c + course4c);
        double gpa = myCredits / hourstotal;
        System.out.println(" ");
        System.out.print("Calculated GPA: ");
        System.out.printf("%.2f", gpa);
    }
}