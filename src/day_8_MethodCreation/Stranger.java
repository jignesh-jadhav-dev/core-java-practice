package day_8_MethodCreation;

public class Stranger {
	
  public static void chotu(int a , int b) {
	  System.out.println("Chotu start");
	  int ans = a+b;
	  System.out.println("Sum is "+ans);
	  System.out.println("Chotu End");
  }
		
  public static void main(String[] args) {
	System.out.println("Main start");
	
	chotu(30,35);
	System.out.println("------");
	chotu(300,400);
	
	System.out.println("Main End");
  }
}
