package day_9_Pattern_Program_1;

public class Brooklyn {
	
	public static void chotu(int a, int b)
	{
	 	System.out.println("Chotu start");
	 	int ans = a+b;
	 	System.out.println("Sum is "+ans);
	 	System.out.println("Chotu End");
	}
	

  public static void main(String[] args) {
	System.out.println("Main start");

	chotu(200,760); 
	chotu(420,500);
	
	System.out.println("Main End");
  }
}
