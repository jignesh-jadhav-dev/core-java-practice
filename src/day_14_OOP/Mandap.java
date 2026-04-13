package day_14_OOP;

class Shadi{
	
	Shadi(){
		System.out.println("Shadi ka Khana");
	}
}

public class Mandap {
  public static void main(String[] args) {
	System.out.println("Main  start");
	
	Shadi s1 = new Shadi();  //Object 1
	System.out.println("------");
	Shadi s2 = new Shadi();  //Object 2
	
	System.out.println("Main  End");
}
} 
