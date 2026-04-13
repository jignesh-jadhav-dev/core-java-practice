 package day_21_ExceptionHandling;

import java.util.Scanner;

public class HDFC {
	
	public static void withdraw(int wAmt, int bal) throws PagalHaiKyaException {
		 if(wAmt<=bal) {
			   System.out.println(wAmt+" withdraw Successful");
		   }else {
			 throw new PagalHaiKyaException();
		   }
	}	
	
   public static void main(String[] args) {
	System.out.println("Main start");
	   int bal = 20000;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter amt u like to Withdraw");
	   int wAmt = sc.nextInt();
	   try {
	   withdraw(wAmt,bal);
	   }catch(PagalHaiKyaException p1) {
		   System.out.println("tera Bap Chod Ke Gaya Tha Ke Tere Maa.");
	   }finally {
		   sc.close();
		   System.out.println("Thank you for Visiting Come again");
	   }
	   System.out.println("Main End");
}
}
