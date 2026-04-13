package day_01_Operator;

public class Thor {
	
	// arithmetic operation
	
  public static void main(String[] args) {
	  
	   System.out.println(5%2); //1
	   System.out.println(5.0/2); //2.5
	   System.out.println(5/2.0); //2.5   
	   System.out.println(2+2*2); //6
	   	            //BODMAS rule first multiplication
	   
	   System.out.println("--------------");
	
	  int a = 30;
	  int b = 10;
	  
	  System.out.println(a+b);  //40
	  System.out.println(a+100); //130
	  System.out.println(700-300); //400
	  System.out.println(50*5); //250
	  System.out.println(50/10); //5
	  System.out.println(100%10); //0
	  
		System.out.println("----------------------");

		int m = 15;
		int n = 10;
		int p = (m += 50);
		int r = (m + n + (p -= 15));
	  
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		System.out.println(r);
}
}
