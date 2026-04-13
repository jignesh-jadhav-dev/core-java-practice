package day_13_Linear_Binary_search;

import java.util.Scanner;

public class Titan {
	
	 public static int binarySearch(int[] arr , int key) {
		 int start = 0;
		 int end = arr.length-1;
		 
		 while(start<=end) {
			 int mid = (start+end)/2;
			 
			 if(arr[mid]==key) {
				 return mid;
			 }else if(arr[mid]<key) {
				 start = mid+1;
			 }else if(arr[mid]>key) {
				 end= mid-1;
			 }
		 }		 
		 return -1;	 
	 }
		 
		
	  public static void main(String[] args) {
		System.out.println("Main start");
		
		int[] arr = {7,11,23,35,42,55,61,79,82,94,105};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key element to search");
		int key = sc.nextInt();
		
		int ans = binarySearch(arr, key);
		
		if(ans == -1) {
			System.out.println(key+" doesn't Exist");
		}else {
			System.out.println(key+" is Present in index "+ans);
		}
		
		System.out.println("Main End");
}
}
