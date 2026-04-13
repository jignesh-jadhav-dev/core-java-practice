package day_17_TypeCasting;

public class Nobita {
	
	public static void main(int i, double j) {
		System.out.println("main int,double start");

		System.out.println("main int,double End");
	}

	public static void main(String[] args) {
		System.out.println("main String[] start");
         main(600);
         
         main(70,77.65);
		System.out.println("main String[] End");
	}
	public static void main(int a) {
		System.out.println("main int start");

		System.out.println("main int End");
	}
}
