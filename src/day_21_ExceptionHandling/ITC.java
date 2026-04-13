package day_21_ExceptionHandling;
    //Checked Exception  //InterruptedException
public class ITC {
  public static void main(String[] args) {
	  System.out.println("Main start");
	
	  for(int r=1; r<=5; r++) {
		  for(int c=1; c<=5; c++) {
			  System.out.print("* ");
			 try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}
		  }
		  System.out.println();
	  }
	  
	  System.out.println("Main End");
}
}
