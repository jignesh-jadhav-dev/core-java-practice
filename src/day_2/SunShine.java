package day_2;

public class SunShine {
  public static void main(String[] args) {

	  int a = 40;
	  int b = 80;
	  int c = 50;
	  
	  if(a>b)
	  {
		   if(a>c){
			  System.out.println(a+" is Largest"); 
		   }else {
			 System.out.println(c+" is Largest");  
		   }
		  
	  }
	  else 
	  {
		    if(b>c)
		    {
		      System.out.println(b+" is Largest");
	         }
		    else
		    {
		     System.out.println(c+" is Largest");
		    }
	  }
	  
}
}
