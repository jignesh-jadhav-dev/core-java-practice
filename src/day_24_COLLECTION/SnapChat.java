package day_24_COLLECTION;

import java.util.LinkedList;

public class SnapChat {
  public static void main(String[] args) {
	
	  LinkedList<Object> l1 = new LinkedList<Object>();
	  l1.add(60);
	  l1.add("Kunal");
	  l1.add(55.55);
	  l1.add(false);
	  l1.add('A');
	  
	  System.out.println(l1);
	 // [60, Kunal, 55.55, false, A]
	  
	  System.out.println("----------");
	  
	  for(Object ob : l1) {
		  System.out.println(ob);
	  }
}
}
