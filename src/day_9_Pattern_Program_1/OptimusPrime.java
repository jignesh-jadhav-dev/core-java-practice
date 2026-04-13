package day_9_Pattern_Program_1;

public class OptimusPrime {
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2; i<num; i++) 
		{
			if(num%i ==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
  public static void main(String[] args) {
	System.out.println("Main start");
	
	int k = 7;
	 
	if(isPrime(k)) {
		System.out.println(k+" is Prime");
	}else {
		System.out.println(k+" is NOT-Prime");
	}
	
	
	System.out.println("Main End");
}
}
