package day_11_Advance_Pattern;

public class Conjuring {
	
	public static void pyramid(int n) {
		
		 for(int r=1 ; r<=n; r++)    //Outer for loop
		   {
			   //spaces
			   for(int s=1; s<=(n-r); s++) {
				   System.out.print("  ");
			   }
			   
			   //stars
			   for(int k=1; k<=(2*r)-1; k++) {
				   System.out.print("* ");
			   }
			   
			   System.out.println();
		   }
	}
	
   public static void main(String[] args) {
  System.out.println("Main start");
  
  pyramid(4);
  pyramid(12);
  pyramid(7);
  System.out.println("Main End");  
}
}
