package day_19;

abstract class Swarg { // abstract class

	 abstract void rambha(); // abstract method

	public abstract void meenka();

	abstract void urvashi();

	         void narad() { // concrete method
		System.out.println("Narayaan Narayaan...");
	}
	         
	         
	         Swarg(){
	        	 System.out.println("Inside swarg const");
	         }
}

abstract class Indra extends Swarg {

	Indra(){
		System.out.println("Inside indra class");
	}
	
	@Override
	public void meenka() {
		System.out.println("Salsa");
	}

	@Override
	void urvashi() {
		System.out.println("Kathak..");
	}
}

class Ganesh extends Indra {

	Ganesh(){
		System.out.println("Ganesh class const");
	}
	
	@Override
	void rambha() {
		System.out.println("Hip hop Ganesh ke sath..");
	}

}

public class JeevanChakra {
	public static void main(String[] args) {

		Swarg s1 = new Ganesh(); // Upcasting

		/*
		 * Contract of abstract or(what should we do when a class extends abstract
		 * class)
		 * 
		 * 1Rule) When a class inherits an abstract class ,we have to override all the
		 * abstract methods and give implementation/body
		 * 
		 * 2Rule) When a class inherits an abstract class ,and we don't want to override
		 * the inherited abstract method ,then make the subclass as abstract class
		 */
	}
}
