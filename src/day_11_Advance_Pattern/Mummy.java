package day_11_Advance_Pattern;

public class Mummy {
   public static void main(String[] args) {
	
	   int n = 9;
		
	   for(int r=n; r>=1 ; r--)    //Outer for loop
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
}
