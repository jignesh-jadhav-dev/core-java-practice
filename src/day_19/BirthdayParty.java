package day_19;

/*9)A class can  implement any number of interfaces 
(multiple inheritance)
 
10)A class can extend 1 class and implement 
any number of interfaces 
*/

interface Ganesh1{
	void love();
	void party();
}

interface Aniket{
	void love();
	void party();
}

interface Kartik{
	//static concrete method
	static void heart() {
		System.out.println("True Love");
	}
	
	//default method
	default void food() {
		System.out.println("Birayni..");
	}
	
	void love();
	void party();
}

class Tushar {  //class
	
	void ghar() {
		System.out.println("Bada Bangalow");
	}
	
	void gadi() {
		System.out.println("BMW gadi");
	}
	
	
}


class Sanjana extends Tushar implements Ganesh1,Aniket,Kartik{

	@Override
	public void love() {
		System.out.println("Sanajan Managing everyones love");
	}

	@Override
	public void party() {
		System.out.println("Sanjana Controlling all parties");
	}
	
	@Override
	public void food() {
		System.out.println("Momos..");
	}
}

public class BirthdayParty {
  public static void main(String[] args) {
	System.out.println("Main start");
	
	Aniket a1 = new Sanjana(); //Upcasting
	a1.love();
	a1.party();
	System.out.println("-----------");
	
	Kartik k1 = new Sanjana();  //Upcasting
	k1.love();
	k1.party();
	
	
	
	System.out.println("Main End");
}
}
