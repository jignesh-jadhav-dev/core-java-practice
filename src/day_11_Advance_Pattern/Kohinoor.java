package day_11_Advance_Pattern;

public class Kohinoor {
	
	public static void diamond(int n) {
		//first half
		 for(int r=1 ; r<=n; r++)    //Outer for loop
		   {
			   //spaces
			   for(int s=1; s<=(n-r); s++) {
				   System.out.print("U ");
			   }
			   
			   //stars
			   for(int k=1; k<=(2*r)-1; k++) {
				   System.out.print("* ");
			   }
			   
			   System.out.println();
		   }
		 
		 //second half
		 for(int r=n-1 ; r>=1; r--)    //Outer for loop
		   {
			   //spaces
			   for(int s=1; s<=(n-r); s++) {
				   System.out.print("  ");
			   }
			   
			   //stars
			   for(int k=1; k<=(2*r)-1; k++) {
				   System.out.print("O ");
			   }
			   
			   System.out.println();
		   }
	}
	
   public static void main(String[] args) {
	System.out.println("Main start");
	System.out.println();
	System.out.println();
	System.out.println();
	
	diamond(8);
	
	
	
	System.out.println("Main End");
}
}
