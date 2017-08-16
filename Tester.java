import java.util.List;
import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) {
//    ArrayList list = new ArrayList();
 //   list.add("Marc was here");
 //   System.out.println((String)list.get(0).toUpperCase());
      String billy = "Billy";
      int b = Integer.parseInt(billy); 
       
    }
    public boolean isIncreasingOrder() {
        boolean isIncreasingOrder = true;
        T variable;
        for (int x = 1; x < data.length; x++) {
            variable = data[x];
            if (variable.compareTo(data[x -1]) < 0) {
                isIncreasingOrder = false;
            }
        }
        return isIncreasingOrder;
    }
}
        