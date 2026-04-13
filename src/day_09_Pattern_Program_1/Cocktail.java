package day_09_Pattern_Program_1;

public class Cocktail {
   public static void main(String[] args) {
	
	   int  rn = 15;
	   int cn = 15;
	   
	   for(int r=1; r<=rn; r++) 
	   {
		   for(int c=1; c<=cn; c++)
		   {
			   if(r==1 || c==1 || r==rn||c==cn  ||r==c || r+c==rn+1)
			   {
				   System.out.print("  ");
			   }
			   else 
			   {
				   System.out.print("* ");
			   }
		   }
		   System.out.println();
	   }
}
}
