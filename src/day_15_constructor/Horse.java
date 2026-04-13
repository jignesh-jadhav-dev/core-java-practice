package day_15_constructor;

public class Horse {
	
	static String s;  //static global var
	      int num ; //non-static
	      
	  static {  //static block 1
		  s ="Varun";
	    //num = 500; //CTE 
		  System.out.println("A....");
	  }
	
	  static {  //static block 2
		  s ="RDJ";
		  System.out.println("B....");
	  }
	
  public static void main(String[] args) {
	System.out.println("C..Main start");
	
	System.out.println(s);  //Siddhartha
	
		
	System.out.println("D..Main End");
  }
  
  static {  //static block 3
	  s ="Siddhartha";
	  System.out.println("E....");
  }
  
}
