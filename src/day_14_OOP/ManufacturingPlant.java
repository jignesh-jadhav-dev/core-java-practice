package day_14_OOP;

class Audi{

	String colour="Red";  //non-static global variable
	int speed = 200;
	double mil = 7;
	
	 void details() {   //non-static method
		System.out.println("Car Colour is "+colour
				+"  Speed is  "+speed+"   Milage is :"+mil);
	}	
}

public class ManufacturingPlant {
	
    public static void main(String[] args) {
	 System.out.println("Manu Start");
	 
	 Audi a1 = new Audi();  //Object 1
	 System.out.println(a1); //box14.Audi@24d46ca6
	
	 System.out.println("-----"); 
	 Audi car2 = new Audi();  //Object 2
	 System.out.println(car2); // box14.Audi@4517d9a3
	 
	 
	 System.out.println("------");
	 
	 car2.colour= "Black";
	 a1.speed= 235;
	 
	 a1.details(); // Car Colour is Red  Speed is  200   Milage is :7.0
	 car2.details(); //Car Colour is Red  Speed is  200   Milage is :7.0
	 System.out.println("Manu End");
    }
}
