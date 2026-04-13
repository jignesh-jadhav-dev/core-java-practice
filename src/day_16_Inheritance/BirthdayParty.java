package day_16_Inheritance;

class Aniket {

	void love() {

	}

	void party() {
		System.out.println("Taj");
	}
}

class Ganesh {

	void love() {

	}

	void party() {
		System.out.println("Candies...");
	}

}

class Sanjana extends Aniket{

}

public class BirthdayParty {
	public static void main(String[] args) {
     System.out.println("Birthday start");  
		Sanjana s1 = new Sanjana();
		s1.party();
		   System.out.println("Birthday End"); 	
	}
}
