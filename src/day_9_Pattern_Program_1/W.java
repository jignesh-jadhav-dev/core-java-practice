package day_9_Pattern_Program_1;

public class W {
  public static void main(String[] args) {

	   int  rn = 15;
	   int cn = 15;
	   
	   for(int r=1; r<=rn; r++) 
	   {
		   for(int c=1; c<=cn; c++)
		   {
			  if(r==rn/2+1  && c==cn/2+1) {
				  System.out.print("😎");
			  }else if( c==1 || c==cn  
					   ||  r==c  
					   || r+c==rn+1)
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
