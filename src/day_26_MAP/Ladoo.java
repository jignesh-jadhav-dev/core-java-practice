package day_26_MAP;

import java.util.HashMap;

public class Ladoo {
   public static void main(String[] args) {
	
	   HashMap<Integer,String> h1 = new HashMap<Integer,String>();
	   h1.put(502,"Vishvesh");
	   h1.put(501,"Kunal");
	   h1.put(500,"Rajesh");
	   h1.put(505,"Rajesh");
	   h1.put(501,"Jeni");
	  
	   System.out.println(h1);
	   System.out.println(h1.get(501));
	  
}
}
