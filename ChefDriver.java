public class ChefDriver{
    public static void main(String[] args) {
        Chef billy = new Chef("Billy", 5, 2);
        Chef steve = new Chef("Steve", 2);
        Chef buga = new Chef("Buga", 3, 4, 5);
        steve.cook(3, 2);
        buga.cook(2);
        billy.cook(1,2,3);
        steve.restock(10,10,10);
        steve.cook(3,2);
        steve.cook(3,4);
        steve.cook(4,3);




        System.out.println(billy);
        System.out.println(steve);
        System.out.println(buga);
    }
}