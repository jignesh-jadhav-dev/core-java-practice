package day_24_COLLECTION;

import java.util.ArrayList;
import java.util.Vector;

public class Hastar {
    public static void main(String[] args) {
		
    	ArrayList<Object> bag1 = new ArrayList<Object>();
    	bag1.add("Puneet");
    	bag1.add("Neel");
    	bag1.add("Urfi");
    	bag1.add("Deepak");
    	
    	System.out.println("------------");
    	                                //we can also pass in constructor
    	Vector<Object> bag2 = new Vector<Object>(bag1);
    	bag2.add(420);
    	bag2.add("Orry");
    	bag2.add("Rakhi");
    	bag2.add(true);
    	
    	      //bag2.addAll(bag1); 
    	//if u want to add 1 collection in another collection 
  
    	System.out.println(bag2);
    	//[Puneet, Neel, Urfi, Deepak, 420, Orry, Rakhi, true]
       System.out.println("-------------");
    	System.out.println(bag2.containsAll(bag1)); //true
    	bag2.remove("Puneet");
    	System.out.println(bag2);
    	//[Neel, Urfi, Deepak, 420, Orry, Rakhi, true]

    	System.out.println("------------");
    	System.out.println(bag2.containsAll(bag1)); //false
    	System.out.println("-------");
    	
    	bag2.removeAll(bag1);
    	System.out.println(bag2); //[420, Orry, Rakhi, true]
    	
    	
    	
	}
}
