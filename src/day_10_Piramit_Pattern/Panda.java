package day_10_Piramit_Pattern;

public class Panda {
   public static void main(String[] args) {
	
	   int rn = 17;
	   int cn = 17;
	   
	   for(int r=1; r<=rn; r++)
	   {
		   for(int c=1; c<=cn; c++)
		   {
			  if(r==1 || r==rn || c==1 || c==cn 
					  || r==c
					  || r+c ==rn+1) {
				  System.out.print("  ");
			  }else {
				  System.out.print("O ");
			  }
		   }
		   System.out.println();
	   }
}
}
