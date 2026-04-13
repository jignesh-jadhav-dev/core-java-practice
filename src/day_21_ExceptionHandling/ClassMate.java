package day_21_ExceptionHandling;

import java.util.Scanner;

public class ClassMate {
  public static void main(String[] args) {
	System.out.println("Main start");
	
	String str = "Tushar";
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the index to print Character");
	int n = sc.nextInt();
	
	try {
	System.out.println(str.charAt(n));
	}catch(StringIndexOutOfBoundsException s1) {
		System.out.println("String Bhara ,Out of Bound ho raha hai");
	}
	System.out.println("Main End");
}
}
