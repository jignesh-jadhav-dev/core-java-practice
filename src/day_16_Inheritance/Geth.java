package day_16_Inheritance;

class Father{
	
	 void land() {
		System.out.println("100 acre Land");
	}
}

class Son extends Father{
	 
	//1 inherited method is present
}

public class Geth {

	public static void main(String[] args) {
      
		Son s1= new Son();
		s1.land(); //100 acre Land
	}

}
