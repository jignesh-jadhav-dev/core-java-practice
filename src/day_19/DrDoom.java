package day_19;

abstract class Annabella{ //abstract class
	
	abstract void kill(); //abstract method
	
	void dance() {  //concrete method
		System.out.println("Lavni");
	}
}

class Danny{  //concrete class
	
	//abstract void jump();
	
	void sing() { //concrete method
		System.out.println("Singing..");
	}
}


public class DrDoom {
   public static void main(String[] args) {
  System.out.println("Main start");
  
  Danny d1 = new Danny();
  
 // Annabella a1 = new Annabella();
  
  System.out.println("Main End");	
	   
}
}
