package day_13_Linear_Binary_search;

public class Rhino {
  
	static String colour = "Red";  //static global variable
	       String name = "Kunal";  //non-static global variable
	
	static  void dance(int a) {  //static method
		a = 90;
		int r = 500;  //local variable
		System.out.println("Garba...");
	}
	 
	    void jump() {  //non-static method
	      System.out.println("Terrace se Jump..");	
	    }
	
	
	public static void main(String[] args) {
		System.out.println("Main start");
		
	         int price= 150;  //local variable
		     double per = 92.35;
		  //local variable do not have static non-static concept
		
		System.out.println("Main End");
	}
}
