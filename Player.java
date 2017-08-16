import java.util.Scanner;
/**
*Instantiates a Player character
*Player has name, type & life
*@author Michael Goodrum
*@version 1.0
*@since 2016-05-05
*/




public class Player {
    private String name;
    private String type;
    private int life;
    /**
    *creates Player object
    *@param name returns string
    *@param type returns string
    *@param life returns int
    */
    public Player(String name, String type, int life) {
        this.name = name;
        this.type = type;
        this.life = life;
    }

    /**
    *@return getName returns string
    */
    public String getName() {
        return name;
    }

    /**
    *@return getLife returns int
    */
    public int getLife() {
        return life;
    }
    /**
    @return getType returns string
    */
    public String getType() {
        return type;
    }
    /**
    *breakGlass breaks and goes back
    *to the beggining of the game
    */
    public void breakGlass() {
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner scan = new Scanner(System.in);
            boolean keepGoing1 = true;
            System.out.println("Glass shatters, "
                + "and you hear a loud noise come from the CS1371 Lab.");
            System.out.println("[run] Run away from the loud noise.");
            System.out.println("[wait] Wait and fight the monster.");
            while (keepGoing1) {
                String nextMove1 = scan.nextLine();
                boolean runOrWait = true;
                while (runOrWait) {
                    if (nextMove1.equalsIgnoreCase("run")) {
                        boolean goOn = true;
                        System.out.println("You run down the hallway "
                            + "as fast as you can.");
                        System.out.println("You look behind you "
                            + "and a monster is after you.");
                        System.out.println("[keep running] Make "
                            + "a final dash for it.");
                        System.out.println("[fight] Turn around "
                            + "and face your fears.");
                        while (goOn) {
                            String nextDeci = scan.nextLine();
                            boolean keepOrFight = true;
                            while (keepOrFight) {
                                if (nextDeci.equalsIgnoreCase("keep running")) {
                                    System.out.println("You got away safely! "
                                        + "Congratulations you beat the game.");
                                    System.out.println("Would you "
                                        + "like to play again? (Y/N)");
                                    String playAgain = scan.nextLine();
                                    if (playAgain.equalsIgnoreCase("Y")) {
                                        return;
                                    } else {
                                        System.exit(0);
                                    }
                                } else if (nextDeci.equalsIgnoreCase("fight")) {
                                    System.out.println("You start a "
                                        + "battle of epic proportions.");
                                    System.out.println("Unfortunatly the "
                                        + "monster gets the best of you. "
                                        + "GAME OVER!!!");
                                    System.out.println("Would you "
                                        + "like to play again? (Y/N)");
                                    String playAgain4 = scan.nextLine();
                                    if (playAgain4.equalsIgnoreCase("Y")) {
                                        return;
                                    } else {
                                        System.exit(0);
                                    }
                                } else {
                                    System.out.println("Please choose "
                                        + "keep running or fight.");
                                    keepOrFight = false;
                                }
                            }
                        }
                    } else if (nextMove1.equalsIgnoreCase("wait")) {
                        boolean keepGoing2 = true;
                        System.out.println("You wait in fearfull silence.");
                        System.out.println("The monster appears and "
                            + "the fight is about to beggin.");
                        System.out.println("[fight] Face the "
                            + "monster and try your luck.");
                        System.out.println("[run] Run "
                            + "from your imminent doom.");
                        while (keepGoing2) {
                            String nextMove2 = scan.nextLine();
                            boolean fightOrRun = true;
                            while (fightOrRun) {
                                if (nextMove2.equalsIgnoreCase("fight")) {
                                    System.out.println("The monster eats you "
                                        + "with no hesitation! "
                                        + "GAME OVER!!!");
                                    System.out.println("Would you "
                                        + "like to play again? (Y/N)");
                                    String playAgain2 = scan.nextLine();
                                    if (playAgain2.equalsIgnoreCase("Y")) {
                                        return;
                                    } else {
                                        System.exit(0);
                                    }
                                } else if (nextMove2.equalsIgnoreCase("run")) {
                                    System.out.println("You run down the hallwa"
                                        + "y as fast as you can.");
                                    System.out.println("Your attempts "
                                        + "are useless "
                                        + "and you are gobbled up.");
                                    System.out.println("GAME OVER!!!! Would "
                                        + "you like to play again? (Y/N)");
                                    String playAgain3 = scan.nextLine();
                                    if (playAgain3.equalsIgnoreCase("Y")) {
                                        return;
                                    } else {
                                        System.exit(0);
                                    }
                                } else {
                                    System.out.println("Please choose "
                                        + "fight or run.");
                                    fightOrRun = false;
                                }
                            }
                        }
                    } else {
                        System.out.println("Please choose run or wait.");
                        runOrWait = false;
                    }
                }
            }
        }
    }
    /**
    *waitInside breaks and returns
    *back to the beggining of the game
    *as well
    */
    public void waitInside() {
        Scanner scan = new Scanner(System.in);
        boolean keepGoing3 = true;
        System.out.println("You wait in fearfull silence.");
        System.out.println("You can see the monster throught the window.");
        System.out.println("[keep waiting] Stay in silence and "
            + "hope the monster doesn't see you.");
        System.out.println("[run] Run from your imminent doom.");
        while (keepGoing3) {
            String nextMove3 = scan.nextLine();
            boolean keepOrRun = true;
            while (keepOrRun) {
                if (nextMove3.equalsIgnoreCase("keep waiting")) {
                    boolean keepGoing4 = true;
                    System.out.println("The monster walked right by "
                        + "and you are safe.");
                    System.out.println("[look through window] make sure "
                        + "the coast is clear.");
                    System.out.println("[wait] wait for a little longer.");
                    while (keepGoing4) {
                        String nextMove4 = scan.nextLine();
                        boolean checkOrwait = true;
                        while (checkOrwait) {
                            if (nextMove4.equalsIgnoreCase("look through "
                                + "window")) {
                                System.out.println("The monster was "
                                    + "still there! He saw you and got you"
                                    + " by surprise. GAME OVER!!!!");
                                System.out.println("Would you like to play "
                                    + "again? (Y/N)");
                                String playAgain5 = scan.nextLine();
                                if (playAgain5.equalsIgnoreCase("Y")) {
                                    return;
                                } else {
                                    System.exit(0);
                                }
                            } else if (nextMove4.equalsIgnoreCase("wait")) {
                                System.out.println("Your classmates "
                                    + "appear and tell you "
                                    + "everything is fine! Congratulations!");
                                System.out.println("Would you like "
                                    + "to play again? (Y/N)");
                                String playAgain7 = scan.nextLine();
                                if (playAgain7.equalsIgnoreCase("Y")) {
                                    return;
                                } else {
                                    System.exit(0);
                                }
                            } else {
                                System.out.println("Please choose check "
                                    + "hallway or wait more.");
                                checkOrwait = false;
                            }
                        }
                    }
                } else if (nextMove3.equalsIgnoreCase("run")) {
                    boolean keepGoing5 = true;
                    System.out.println("The monster saw you! "
                        + "Theres no espcape.");
                    System.out.println("[close eyes] wait for your doom.");
                    System.out.println("[fight] try to stand your ground.");
                    while (keepGoing5) {
                        String nextMove5 = scan.nextLine();
                        boolean closeOrFight = true;
                        while (closeOrFight) {
                            if (nextMove5.equalsIgnoreCase("close eyes")) {
                                System.out.println("GAME OVER!!! Would you "
                                    + "like to play again? (Y/N)");
                                String playAgain6 = scan.nextLine();
                                if (playAgain6.equalsIgnoreCase("Y")) {
                                    return;
                                } else {
                                    System.exit(0);
                                }
                            } else if (nextMove5.equalsIgnoreCase("fight")) {
                                System.out.println("You faught till the end "
                                    + "but it wasnt good enough! GAME OVER!!!");
                                System.out.println("Would you like "
                                    + "to play again? (Y/N)");
                                String playAgain8 = scan.nextLine();
                                if (playAgain8.equalsIgnoreCase("Y")) {
                                    return;
                                } else {
                                    System.exit(0);
                                }
                            } else {
                                System.out.println("Please "
                                    + "choose close eyes or fight");
                                closeOrFight = false;
                            }
                        }
                    }
                } else {
                    System.out.println("Please choose keep waiting or run.");
                    keepOrRun = false;
                }
            }
        }
    }
}