package day_21_ExceptionHandling;

import java.util.Scanner;

public class Qualified {
  public static void main(String[] args) {
	System.out.println("Main start");
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number");
	  int n = sc.nextInt();
	  
	  String str = "Vishvesh";
	  int[] arr = {10,60,70,45,78,90};
	  
	  try {
	  System.out.println(str.charAt(n));
	  System.out.println(arr[n]);
	  System.out.println(75/n);
	  }catch(ArithmeticException a1) {
		  System.out.println("Gadav Zero se divide mat kar");
	  }catch(StringIndexOutOfBoundsException s1) {
		  System.out.println("String bahar ja raha hai");
	  }catch(ArrayIndexOutOfBoundsException n1) {
		  System.out.println("Terrace pe ja raha hai Tu");
	  }catch(Exception e1) {
		  System.out.println("Kuch tho gadabad hai");
	  }
	  System.out.println("Main End");  
}
}
