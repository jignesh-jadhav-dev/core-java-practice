package day_9_Pattern_Program_1;

public class Alive {
   public static void main(String[] args) {
	
	   int  rn = 15;
	   int cn = 15;
	   
	   for(int r=1; r<=rn; r++) 
	   {
		   for(int c=1; c<=cn; c++)
		   {
			   if(c==cn || r==1|| r==c )
			   {
				   System.out.print("* ");
			   }
			   else 
			   {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
}
}
