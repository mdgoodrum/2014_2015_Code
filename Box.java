public class Box {
    int length;
    int breadth;
    int height;
    public Box() {
        this(10, 20, 30);
    }
    public Box(int length, int breadth) {
        this(length, breadth, 30);
    }
    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
}