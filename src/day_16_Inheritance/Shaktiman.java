package day_16_Inheritance;
class Pitaji{
	
	void gold() {
		System.out.println("10 kg Sona");
	}
	
	void work() {
		System.out.println("Hard work..");
	}
	
	private void ghar() {
		System.out.println("Bada Ghar..");
	}
}

class Vishvesh extends Pitaji{
	
	void masti() {
		System.out.println("Daru Peena..");
	}
	
}

public class Shaktiman {
  public static void main(String[] args) {
	System.out.println("Main start");
	
	Vishvesh v1 = new Vishvesh();
	v1.gold();
	v1.work();
	 // v1.ghar(); //private methods will not be inherited in sub class
	v1.masti();
	
	System.out.println("Main End");
}
}
