package day_22_StringClass;


//2 After Overriding toString()

class Thar {  
	String colour;
	int price;
		 
	public Thar(String colour, int price) {
		this.colour = colour;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car colour is "+colour+" Price is "+price;
	}
	
}

public class Mahindra {
   public static void main(String[] args) {
	
	   Thar t1 = new Thar("Black", 22);
	   System.out.println(t1); //Car colour is Black Price is 22
	   System.out.println(t1.toString()); //Car colour is Black Price is 22
	   
	   System.out.println("------------");
	   
	   Thar t2 = new Thar("Red", 25);
	   System.out.println(t2); //Car colour is Red Price is 25
	   System.out.println(t2.toString()); //Car colour is Red Price is 25
}
}
