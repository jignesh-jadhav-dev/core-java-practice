package day_04_ScannerClass;

import java.util.Scanner; //step 1

public class Jaljera {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in); //step 2
	   
	   System.out.println("Enter your Name");
	   String n = sc.next();  //step 3
	   
	   System.out.println("Enter your age");
	   int age = sc.nextInt(); //step 3
	   
	   System.out.println("Enter Gender");
	   char gen = sc.next().charAt(0); //step 3
	   
	   System.out.println("-----------");
	   
	   System.out.println("Name is :"+n);
	   System.out.println("Age is :"+age);
	   System.out.println("Gender is :"+gen);
}
}
