package day_21_ExceptionHandling;

public class KoiMilGaya extends Object {
  
	public static void jadoo() throws InterruptedException,ArithmeticException {
		for(int i=0; i<=10; i++) {
			System.out.println(i);			
				Thread.sleep(300);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main start");
		
		try {
	      jadoo();
		}catch(ArithmeticException a1) {
			System.out.println("Gadav Zero se divide mat Kar");
		}catch(InterruptedException i1) {
			System.out.println("Handled");
		}
		
		System.out.println("Main End");
	}
}
