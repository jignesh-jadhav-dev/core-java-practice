package day_4_ScannerClass;

import java.util.Scanner; //stpe 1

public class Railway {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in); //step 2
	  System.out.println("Enter a Num to print day(1 - 7)");
	  int day = sc.nextInt();
	                  //Advance switch
	  switch(day)
	  {
	  case 1,420 -> System.out.println("Monday"); 
	  case 2 -> System.out.println("Tuesday");  
	  case 3,786 -> System.out.println("Wednesday"); 
	  case 4,'A' -> System.out.println("Thursday"); 
	  case 5 -> System.out.println("Friday");
	  case 6 -> System.out.println("Saturday");
	  case 7 -> System.out.println("Sunday");  
	  default->  System.out.println("Invalid day of week");
	  }
}
}
