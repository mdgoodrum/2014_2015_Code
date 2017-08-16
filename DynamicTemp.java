import java.util.Scanner;

public class DynamicTemp {
	public static void main(String[] args) {
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Please enter a Fahrenheit temperature"
	                        + " to convert to Celsius: ");
			Scanner scan = new Scanner(System.in);
			int temp = scan.nextInt();
			scan.nextLine();
			System.out.println("What city is that?");
			String city = scan.nextLine();
			double celsius = (5.0 / 9) * (temp - 32);
			System.out.print("The temperature in " + city + " in celsius is: ");
			System.out.printf("%.2f", celsius);
			final String DEGREE  = "\u00b0";
			System.out.println(DEGREE);
			System.out.println("Would you like to continue? (Y/N)");
			String keepGoingStr = scan.nextLine();
			if (keepGoingStr.equalsIgnoreCase("N")) {
				keepGoing = false;
			}
		}
	}
}