package day_25_COLLECTION;

import java.util.*;

public class CaptainAmerica {
   public static void main(String[] args) {
	
	  HashSet<Object> h1 = new HashSet<Object>();
	  
	  h1.add("Kunal");
	  h1.add("Kunal");
	  h1.add("Jeni");
	  h1.add('Z');
	  h1.add('Z');
	  h1.add("Sandhya");
	  h1.add("Supriya");
	  h1.add("Shreya");
	  h1.add("Vishvesh");
	  h1.add("Geeta");
	  h1.add(true);
	  h1.add("Rajesh");
	  h1.add("Riya");
	  h1.add(786);
	  h1.add(786);
	  h1.add(150);
	  h1.add(null);
	  
	  System.out.println(h1);
	  //[null, Shreya, Geeta, Sandhya, Supriya, Rajesh, Vishvesh,
	                  //true, 786, Jeni, 150, Kunal, Riya, Z]

	  //Insertion order is Not maintained 
	  //Duplication is not allowed
	  
	 //System.out.println(h1.get(4)); //CTE
	  //set is not Index Based

}
}
