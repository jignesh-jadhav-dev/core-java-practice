package day_21_ExceptionHandling;

import java.util.Scanner;

public class Quest {
  public static void main(String[] args) {
	System.out.println("Main start");
	
	int[] arr = {23,5,78,34,56,35,25,78,90,12};
	//length 10 , index 0-9
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Index to print Element");
	int n = sc.nextInt();
	
	try {
	System.out.println(arr[n]);
	}catch(ArrayIndexOutOfBoundsException a1) {
		System.out.println("Terrace pe ja raha hai tu neeche aja");
	}
	System.out.println("Main End");
}
}
