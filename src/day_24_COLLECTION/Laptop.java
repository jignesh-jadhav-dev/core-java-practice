package day_24_COLLECTION;

import java.util.ArrayList;

public class Laptop {
   public static void main(String[] args) {
	
	   ArrayList<String> a1 = new ArrayList<String>();
	   a1.add("Vishvesh");
	   a1.add("Kunal");
	   a1.add("Shreya");
	   a1.add("Supriya");
	   a1.add("Swati");
	   a1.add("Shraddha");
	   a1.add("Bhavika");
	   a1.add("Rajesh");
	   
	   System.out.println(a1);
	   //[Vishvesh, Kunal, Shreya, Supriya, Swati, Shraddha, Bhavika, Rajesh]
        System.out.println(a1.size());
        System.out.println(a1.indexOf("Rajesh")); //7
	   a1.add(3,"Sandya");
	   System.out.println(a1);
	   
	   a1.remove("Vishvesh");
	   System.out.println(a1);
	   
	   System.out.println("------");
	   
	   a1.set(7,"Riya");
	   System.out.println(a1);
	  
}
}
