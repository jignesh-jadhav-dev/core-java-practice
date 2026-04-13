package day_12_Arrays;

import java.util.Scanner;

public class SkyWalk {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Total rows in array");
	  int rn = sc.nextInt();
	  System.out.println("Enter Total Columns in array");
	  int cn = sc.nextInt();
	  
	  int[][] arr2d = new int[rn][cn];  
	  
	  System.out.println("-----------");
	  //to store the elements
	  for(int r=0; r<rn; r++) {
		  for(int c=0; c<cn; c++) {
			  System.out.println("Enter ("+r+","+c+") Element");
			  arr2d[r][c] = sc.nextInt();
		  }
		  System.out.println();
	  }
	 
	  System.out.println("--------");
	 //to print elements 
	  for(int r=0; r<rn; r++) {
		  for(int c=0; c<cn; c++) {
			 System.out.print(arr2d[r][c]+" ");
		  }
		  System.out.println();
	  }
}
}
