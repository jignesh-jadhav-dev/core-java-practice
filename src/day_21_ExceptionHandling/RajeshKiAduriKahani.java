package day_21_ExceptionHandling;

import java.util.Scanner;

public class RajeshKiAduriKahani {
   public static void main(String[] args) {
	System.out.println("Main start");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number");
	int a = sc.nextInt();
	System.out.println("Enter 2nd number");
	int b = sc.nextInt();
	
	try {
	System.out.println(a/b);
	}catch(ArithmeticException a1) {
		System.out.println("Gadav Zero se divide mat kar");
	}
	
	System.out.println("Main End");
}
}
