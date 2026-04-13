package day_24_COLLECTION;

public class Panchayat {
   public static void main(String[] args) {
	
	   int[] arr = {25,70,90,75,25,60,24,56,78,98,23};
	   
	   for(int i=0; i<arr.length; i++) {
		 System.out.println(arr[i]);  
	   }
	   System.out.println("------------");
	   
	   for(int n : arr) {
		   System.out.println(n);
	   }
}
}
