package day_21_ExceptionHandling;

import java.util.Scanner;

public class Axis {
   public static void main(String[] args) {
	System.out.println("Main start");
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a Number");
	   int n = sc.nextInt();
	   
	   try {
	   System.out.println(55/n);
	   }catch(ArithmeticException a1) {
		   System.out.println("Zero se Divide mat kar");
	   }finally {
		   sc.close();
		   System.out.println("Thank you For Visiting Come again");
	   }
	   
	   System.out.println("Main End");
}
}
