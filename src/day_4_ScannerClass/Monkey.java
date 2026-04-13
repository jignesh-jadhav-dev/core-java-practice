package day_4_ScannerClass;

import java.util.Scanner; //step 1

public class Monkey {
  public static void main(String[] args) {
	System.out.println("Main start");
	  Scanner sc = new Scanner(System.in); //step 2  //Scanner Object
	   
	  System.out.println("Enter Your Name");
	  String s = sc.next(); //step 3
	  
	  System.out.println("Enter Your age");
	  int age = sc.nextInt(); //step 3
	  
	  System.out.println("------");
	  
	  System.out.println("Name is :"+s);
	  System.out.println("Age is :"+age);
	  
	  System.out.println("Main End");
}
}
