package day_14_OOP;

class Nano{
	
	String colour;
	int speed;
	double price;
	
    //short cut --> right click -->source--> generate Constructor using fields
	//Constructor
	public Nano(String colour, int speed, double price) {
		this.colour = colour;
		this.speed = speed;
		this.price = price;
		System.out.println("this keyword contains "+this);
	}

	void info() {
		System.out.println("Nano colour is "+colour
				+" Speed is "+speed+"  Price is "+price);
	}
}

public class Tata {
   public static void main(String[] args) {
	System.out.println("Main start");
	
	Nano n1 = new Nano("Blue", 130, 4.5); //Object 1
	System.out.println("n1 Contains "+n1);
	n1.info();
	
	System.out.println("-------");
	
	Nano n2 = new Nano("Green", 120, 3.5); //Object 2
	System.out.println("n2 Contains "+n2);
	n2.info();
	System.out.println("Main End");
}
}
