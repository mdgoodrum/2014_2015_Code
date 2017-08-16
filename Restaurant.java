import java.util.Random;
import java.util.Scanner;
/**
 * Creates the simulation of the restaurant
 * creates a noodle chef a veggies chef
 * and a combo chef
 * restaurant opens at 5:00 and closes at 11:00
 * simulation calculates customer entry for each 30 mins
 * @author Michael Goodrum
 * @version 1.0
 * @since 6-19-16
 */
public class Restaurant {
    static final double RESTOCK_AMOUNT = 20.0;
    /**
     * Creates restaurant
     * @param  args [promps chefs for their infos and begins]
     */
    public static void main(String[] args) {
        int time = 5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Noodle chef name: ");
        String name1 = scan.nextLine();
        System.out.print("Chef " + name1 + "'s amount of noodles: ");
        double noodles1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("");
        Chef noodleGuy = new Chef(name1, noodles1);
        System.out.print("Vegetarian Chef's name: ");
        String name2 = scan.nextLine();
        System.out.print("Chef " + name2 + "'s amount of noodles: ");
        double noodles2 = scan.nextDouble();
        System.out.print("Chef " + name2 + "'s amount of vegetables: ");
        double veggies1 = scan.nextDouble();
        Chef veggieGuy = new Chef(name2, noodles2, veggies1);
        System.out.println("");
        scan.nextLine();
        System.out.print("Combo Chef's name: ");
        String name3 = scan.nextLine();
        System.out.print("Chef " + name3 + "'s amount of noodles: ");
        double noodles3 = scan.nextDouble();
        System.out.print("Chef " + name3 + "'s amount of vegetables: ");
        double vegetables2 = scan.nextDouble();
        System.out.print("Chef " + name3 + "'s amount of pork: ");
        double pork = scan.nextDouble();
        Chef comboGuy = new Chef(name3, noodles3, vegetables2, pork);
        System.out.println("\n*Simulating!*\n");
        while (time < 11) {
            System.out.println("[" + time + ":00 - " + time + ":30]\n");
            for (int n = numberOfOrders(); n > 0; n--) {
                double amount = ingredientAmount();
                noodleGuy.cook(amount);
            }
            for (int n = numberOfOrders(); n > 0; n--) {
                double amount1 = ingredientAmount();
                double amount2 = ingredientAmount();
                veggieGuy.cook(amount1, amount2);
            }
            for (int n = numberOfOrders(); n > 0; n--) {
                double amount1 = ingredientAmount();
                double amount2 = ingredientAmount();
                double amount3 = ingredientAmount();
                comboGuy.cook(amount1, amount2, amount3);
            }
            System.out.println(noodleGuy);
            System.out.println(veggieGuy);
            System.out.println(comboGuy);
            System.out.println("\n[" + time + ":30 - " + ++time + ":00]\n");
            for (int n = numberOfOrders(); n > 0; n--) {
                double amount = ingredientAmount();
                noodleGuy.cook(amount);
            }
            for (int n = numberOfOrders(); n > 0; n--) {
                double amount1 = ingredientAmount();
                double amount2 = ingredientAmount();
                veggieGuy.cook(amount1, amount2);
            }
            for (int n = numberOfOrders(); n > 0; n--) {
                double amount1 = ingredientAmount();
                double amount2 = ingredientAmount();
                double amount3 = ingredientAmount();
                comboGuy.cook(amount1, amount2, amount3);
            }
            System.out.println(noodleGuy);
            System.out.println(veggieGuy);
            System.out.println(comboGuy);
            noodleGuy.restock(RESTOCK_AMOUNT, 0.0, 0.0);
            veggieGuy.restock(RESTOCK_AMOUNT, RESTOCK_AMOUNT, 0.0);
            comboGuy.restock(RESTOCK_AMOUNT, RESTOCK_AMOUNT, RESTOCK_AMOUNT);
            System.out.println("\n*Resupply!*\n");
        }
        System.out.println("*Final Results*\n");
        System.out.println(noodleGuy);
        System.out.println(veggieGuy);
        System.out.println(comboGuy);
        System.out.println("\nIn total, " + Chef.totalMade()
            + " bowls of ramen were served.");
    }
    private static int numberOfOrders() {
        Random random = new Random();
        int orders = random.nextInt(6);
        return orders;
    }
    private static double ingredientAmount() {
        double random = new Random().nextDouble();
        double result = random * 5.0;
        return result;
    }
}