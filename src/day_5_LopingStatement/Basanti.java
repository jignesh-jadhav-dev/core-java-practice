package day_5_LopingStatement;

public class Basanti {
  public static void main(String[] args) {
	

	   for(int i=20; i<=50; i++) 
	   {
		  if(i%5 ==0) 
		  {
			  System.out.println(i);  
		  }
	   }
	   
	   System.out.println("-------");
	   
	   for(int i=20 ; i<=50; i+=5) {
		   System.out.println(i);
	   }
}
}
