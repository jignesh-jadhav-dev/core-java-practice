package day_11_Advance_Pattern;

public class Monitor {
   public static void main(String[] args) {
	
	   int n= 9;
	   
	   for(int r=n; r>1; r--) 
	   {
		   //spaces
		   for(int s = 1; s<=(n-r); s++) {
			   System.out.print("  ");
		   }
		   
		   //stars
		   for(int k=1; k<=(2*r)-1; k++) {
			   if(k==1 || k==(2*r)-1 || r==n|| r==2||r==3||r==4||r==5||r==6) {
				   System.out.print("* ");
			   }else {
				   System.out.print("  ");
			   }
		   }
		   
		   System.out.println();
	   }
	   
	   for(int r=1; r<=n; r++) 
	   {
		   //spaces
		   for(int s = 1; s<=(n-r); s++) {
			   System.out.print("  ");
		   }
		   
		   //stars
		   for(int k=1; k<=(2*r)-1; k++) {
			   if(k==1 || k==(2*r)-1 || r==n || k==r|| r==n-1||r==n-2) {
				   System.out.print("* ");
			   }else {
				   System.out.print("  ");
			   }
		   }
		   
		   System.out.println();
	   }
}
}
