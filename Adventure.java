import java.util.Scanner;

/**
* The Adventure program starts the text based adventure
* rpg and istantiates a player object
*
* @author  Michael Goodrum
* @version 1.0
* @since   2016-05-05
*/


public class Adventure {
/** Beggins the adventure
*@param args returns strings the describes the adventure
*/
    public static void main(String[] args) {
        boolean gameOn = true;
        while (gameOn) {
            Scanner scan = new Scanner(System.in);
            System.out.println("What's your name: ");
            String name = scan.nextLine();
            boolean character = true;
            String charType = null;
            System.out.println("What kind if character would you like to be: "
                + "[vampire] [warewolf] [human]");
            while (character) {
                charType = scan.nextLine();
                if (charType.equalsIgnoreCase("vampire")) {
                    charType = "vampire";
                    character = false;
                } else if (charType.equalsIgnoreCase("warewolf")) {
                    charType = "warewolf";
                    character = false;
                } else if (charType.equalsIgnoreCase("human")) {
                    charType = "human";
                    character = false;
                } else {
                    System.out.println("Please choose one of our"
                        + " available character types.");
                }
            }

            System.out.println("Please input how "
                + "many life points you have: ");
            int life = scan.nextInt();
            Player player1 = new Player(name, charType, life);
            System.out.println("Welcome " + player1.getName()
                + " the " + player1.getType() + "!");
            System.out.println("You have " + player1.getLife()
                + " life points.");
            System.out.println("Let the adventure begin.");
            System.out.println("...");
            System.out.println("You awake alone, disoriented,"
                + "and locked in the CS1331 TA Lab.");
            System.out.println("[break] Break the glass.");
            System.out.println("[wait] Wait for someone to come by.");
            boolean keepGoing = true;
            scan.nextLine();
            while (keepGoing) {
                String nextMove = scan.nextLine();
                if (nextMove.equalsIgnoreCase("break")) {
                    player1.breakGlass();
                    keepGoing = false;
                } else if (nextMove.equalsIgnoreCase("wait")) {
                    player1.waitInside();
                    keepGoing = false;
                } else {
                    System.out.println("Please choose break or wait.");
                }
            }
        }
    }
}
