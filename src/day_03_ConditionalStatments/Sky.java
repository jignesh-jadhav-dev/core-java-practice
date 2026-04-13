package day_03_ConditionalStatments;

public class Sky {
  public static void main(String[] args) {
	
	  int m = 10;
	  int n = 55;
	  
	  String res = (m<n)? "Sandhya" : "Eno";
	  System.out.println(res);
	  
	  System.out.println("--------");
	  
	      int ans=  ('A'==65) ? 500 : 500;
	      System.out.println(ans);
	      
	  System.out.println("--------");   
	  
	  int r= ("Kunal" !="Kunal")? (50*4+20) : (900-60);
	  System.out.println(r);
	  
	  System.out.println("--------");
	  
	   boolean b  =(55.55 > 55.54)? true : false ; 
	   System.out.println(b);
	   
	  
}
}
