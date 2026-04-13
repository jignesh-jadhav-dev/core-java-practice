package day_7;

public class GhostRider {
  public static void main(String[] args) {
	
	  int num = 6754;
	  int temp = num;
	  int rev = 0;
	 
	  while(num != 0) 
	  {
		int rem = num%10;
		    rev = (rev*10)+rem;
		   num=num/10;
	  }
	  
	  System.out.println("Reverse is "+rev);
	  
	  if(rev == temp) {
		  System.out.println(temp+" is Palindrome");
	  }else {
		  System.out.println(temp+" is NOT-Palindrome"); 
	  }
}
}
