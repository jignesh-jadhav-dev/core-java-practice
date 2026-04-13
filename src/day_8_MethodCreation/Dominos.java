package day_8_MethodCreation;

public class Dominos {
	
	public static void area(double r) {
		System.out.println("Area() start");	
		double res = 3.142*r*r;
		System.out.println("Pizza area is "+res);
		System.out.println("Area() End");
	}
	
	public static void avg(double s1, double s2, double s3) {
		double res = (s1+s2+s3)/3;
		System.out.println("Average is "+res);
	}
	
	
  public static void main(String[] args) {
	System.out.println("Main start");
	
	avg(60,80,45);
	System.out.println("-------");
	area(5.5);
	
	System.out.println("Main End");
}
}
