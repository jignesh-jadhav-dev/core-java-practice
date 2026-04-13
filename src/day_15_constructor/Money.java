package day_15_constructor;

public class Money {
	
	{    //non-static blocks
		System.out.println("Non-static block 1");
	}
	
	{
		System.out.println("Non-static block 2");
	}
	
  public static void main(String[] args) {
	System.out.println("MAin start");
	
	Money m1 = new Money(); //Object 1
	System.out.println("------");
	Money m2 = new Money(); //Object 2
	
	System.out.println("MAin End");
   }
  
    {
		System.out.println("Non-static block 3");
	}
}
