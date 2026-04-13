package day_13_Linear_Binary_search;

import java.util.Scanner;

public class Captain {
	
  public static int linerSearch(int[] arr, int key) {
	
	 for(int i=0; i<arr.length; i++) {
		if(arr[i]==key) {
			return i;
		}
	 }	 
	 return -1;
  }
	
	
  public static void main(String[] args) {
	System.out.println("Main start");
	
	int[] arr = {30,27,51,45,92,79,87,62,51,99};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a key element to search");
	int key = sc.nextInt();
	
	int ans = linerSearch(arr, key);
	
	if(ans == -1) {
		System.out.println(key+" doesn't Exist");
	}else {
		System.out.println(key+" is Present in index "+ans);
	}
	
	System.out.println("Main End");
}
}
