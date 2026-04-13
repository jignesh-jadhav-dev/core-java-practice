package day_09_Pattern_Program_1;

public class Jungle {
  
	public static boolean isPrime(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}	
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Main start");
		
		int n = 9001;
		
		if(isPrime(n)) {
			System.out.println(n+" is Prime");
		}else {
			System.out.println(n+" is Not-Prime");
		}
		
		System.out.println(Math.sqrt(9001));
		System.out.println("Main End");
	}
}
