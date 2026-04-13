package day_9_Pattern_Program_1;

public class Pizzahut {
	
	public static void area(double r)
	{
		System.out.println("A Start");
		double res = 3.142*r*r;
		System.out.println("Area of Pizza is "+res);
		
		System.out.println("A End");
	} 
	
	public static void main(String[] args) {
		System.out.println("Main start");
		area(10);
		area(5);
		area(4.5);
		System.out.println("Main End");
	}
}
