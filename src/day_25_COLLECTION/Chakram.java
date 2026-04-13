package day_25_COLLECTION;

import java.util.Collections;
import java.util.Vector;

public class Chakram {
  public static void main(String[] args) {
	
	  Vector<Integer> v1 = new Vector<Integer>();
	  v1.add(45);
	  v1.add(13);
	  v1.add(60);
	  v1.add(23);
	  v1.add(18);
	  v1.add(80);
	  v1.add(54);
	  v1.add(37);
	  
	  System.out.println(v1);
	  //[45, 13, 60, 23, 18, 80, 54, 37]
	  System.out.println("-----------");
	  Collections.sort(v1);  
	  System.out.println(v1); 
	  //[13, 18, 23, 37, 45, 54, 60, 80]
	  System.out.println("---------");
	  Collections.reverse(v1);
	  System.out.println(v1);
	   //[80, 60, 54, 45, 37, 23, 18, 13]
	  
}
}
