package day_6;

import java.util.Scanner;

public class Barfi {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number to print table");
	  int num = sc.nextInt();
	  
	  int i=1;
	  
	  do {
		  System.out.println(num+" X "+i+" = "+(num*i));
		  i++;
	  }while(i<=10);
	  
	  
	  
	  
	  
//	  while(i<=10) {
//		  System.out.println(num+" X "+i+" = "+(num*i));
//		  i++;
//	  }
}
}
