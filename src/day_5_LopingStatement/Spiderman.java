package day_5_LopingStatement;

public class Spiderman {
   public static void main(String[] args) {
	
	   for(int i=1; i<=10; i++) 
	   {
		  if(i%2 ==0) 
		  {
			  System.out.println(i);  
		  }
	   }
	   
	   System.out.println("-------");
	   
	   for(int i=2 ; i<=10; i+=2) {
		   System.out.println(i);
	   }
	   
}
}
