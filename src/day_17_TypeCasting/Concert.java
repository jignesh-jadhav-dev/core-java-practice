package day_17_TypeCasting;

public class Concert {
  public static void main(String[] args) {
	
	  double d = 40; //widening
	  
	 // int a = 78.96;  //narrowing
	  
	  float f1 = 9876543345678987L;
	  System.out.println(f1); //9.876544E15
	
	  float f2 = 87654345678987654567898765f;
	  System.out.println(f2); //8.765434E25
	  
	  System.out.println("------");
	  
	  long l1 = 7654567898765L;
	  float f3 = l1;
	  System.out.println(f3); //7.654568E12
 }
}
