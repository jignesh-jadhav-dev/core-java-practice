package day_05_LopingStatement;

import java.util.Scanner;

public class Jarvis {
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number to print Table");
    	     int num = sc.nextInt();
    	     
    	     for(int i=1; i<=10; i++)
    	     {
    	    	 System.out.println(num+" X "+i+" = "+(num*i));
    	     }
	}
}
