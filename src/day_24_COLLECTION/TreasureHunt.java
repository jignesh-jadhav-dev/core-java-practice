package day_24_COLLECTION;

import java.util.LinkedList;

public class TreasureHunt {
   public static void main(String[] args) {
	
	   LinkedList<Object> l1 = new LinkedList<Object>();
	   l1.add(700);
	   l1.add("Gold");
	   l1.add('A');
	   l1.add(true);
	   
	   System.out.println(l1); //[700, Gold, A, true]
	   l1.add(1,"Rajesh");
	   System.out.println(l1);
	   //[700, Rajesh, Gold, A, true]
}
}
