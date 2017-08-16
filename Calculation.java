public class Calculation {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(2 * n++);
        System.out.println("n is equal to:" + n);
        System.out.println(2 * ++n);
        System.out.println("n is equal to:" + n);
        System.out.println(2 * n + 1);
        System.out.println("n is equal to:" + n);
        System.out.println(2 * 1 + n);
        System.out.println("n is equal to:" + n);
        System.out.println(2 * (n + 1));
        System.out.println("n is equal to:" + n);
        System.out.println(2 * (n++));
        System.out.println("n is equal to:" + n);
    }
}