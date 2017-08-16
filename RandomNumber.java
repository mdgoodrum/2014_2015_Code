import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int orders = random.nextInt(6);
        System.out.println(orders);

        double rand = new Random().nextDouble();
        double result = rand * 5.0;
        System.out.println(result);
    }

}