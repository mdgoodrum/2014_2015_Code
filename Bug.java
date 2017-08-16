public class Bug { 
	// state (private instance variables)


	private int legs;
	private String name;
	private double weight;



	// behavior (private instance methods)

    public Bug (String name, double weight, int legs) {
         
         this.name = name;
         this.weight = weight;
         this.legs = legs;


    }
    

	public void eat() {


	System.out.println("YuM");
	weight = weight + 0.2;
	System.out.println("I now weight: " + weight);

	}





}