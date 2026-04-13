package day_25_COLLECTION;

import java.util.LinkedHashSet;
import java.util.Set;

public class SunShine {
   public static void main(String[] args) {
	
	   Set<Object> l1 = new LinkedHashSet<Object>();
	   l1.add(500);
	   l1.add("Bhavika");
	   l1.add("Bhavika");
	   l1.add("Supriya");
	   l1.add("Shreya");
	   l1.add("Kunal");
	   l1.add("Shreya");
	   l1.add("Vishvesh");
	   l1.add("Sandhya");
	   l1.add("Rajesh");
	   l1.add("Dhanashree");
	   
	   System.out.println(l1);
	   //[500, Bhavika, Supriya, Shreya, Kunal, Vishvesh, Sandhya, Rajesh, Dhanashree]
       System.out.println("----------");
       
	   for(Object ob : l1) {
		   System.out.println(ob);
	   }
}
}
