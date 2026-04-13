package day_10_Piramit_Pattern;

public class Levi {
  public static void main(String[] args) {
	
	 int rn = 11;
	 int cn = 7;
	  
	  for(int r=1; r<=rn; r++)
	  {
		  for(int c=1; c<=cn; c++)
		  {
			System.out.print("😎 ");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				return;
			}
		  }
		  System.out.println();
	  }
}
}
