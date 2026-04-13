package day_12_Arrays;
import java.util.Scanner;

public class TheNun {
	 //Program to array Input from from user and Find Max element
	
	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the total size of array u like to create");
		  int size =sc.nextInt(); 
		  int[] arr = new int[size];
		  System.out.println("-------");
		  //for loop to store elements in array
		  for(int i=0; i<arr.length; i++) {
			  System.out.println("Enter "+i+" element");
			  arr[i]= sc.nextInt();
		  }
		  
		  System.out.println("---------");
		int max = arr[0];  
		  //for loop to print element of array
		  for(int i=0; i<arr.length; i++) {
			  if(arr[i]>max) {
				  max=arr[i];
		        }  
	         }
		  
		  System.out.println("Maximum Element is "+max);
	}

}
