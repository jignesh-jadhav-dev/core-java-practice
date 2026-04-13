package day_8_MethodCreation;

public class Nachos {
  
	  //2 without return type with parameter method
	 public static void areaT(double b, double h) {
		 System.out.println("Method start");
		 double res = (1/2.0)*b*h;
		 System.out.println(res);
		 System.out.println("Method End");
	 }
	
	
	public static void main(String[] args) {
		System.out.println("Main start");
		
		areaT(5,7.5);
		System.out.println("------");
		areaT(4.2, 8.5);
		
		System.out.println("Main End");
		
	}
}
