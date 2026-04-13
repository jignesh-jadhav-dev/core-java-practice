package day_26_MAP;

import java.util.HashMap;

public class Money {
  public static void main(String[] args) {
	
	  HashMap<Object,Object> h1 =  new HashMap<Object, Object>();
	  h1.put(200, "Mango");
	  h1.put("Sandhya", 55.55);
	  h1.put(true, 'A');
	  h1.put(200, "Apple");   //duplicate key  
	  h1.put('Z', 876544567L);
	  
	  System.out.println(h1);
	  System.out.println(h1.size()); //4
	  System.out.println(h1.get(200)); //Apple
	  System.out.println(h1.get(true)); //A
	  System.out.println(h1.get('Z')); //876544567
	  System.out.println("-----------");
	  System.out.println(h1.containsKey(250)); //false
	  System.out.println(h1.containsKey("Sandhya")); //true
	  System.out.println(h1.containsKey(200)); //true
	  System.out.println(h1.containsKey(true)); //true
	  System.out.println("-------------");
	  
	  System.out.println(h1.containsValue("Apple")); //true
	  System.out.println(h1.containsValue(200)); //false 
	  System.out.println(h1.containsValue("Mango")); //false //Overridden
	  System.out.println(h1.containsValue('A')); //true
	  
	  System.out.println("-------------");
	  System.out.println(h1.isEmpty()); //false
	  System.out.println("-----------");
	  System.out.println(h1);
	  //{Sandhya=55.55, 200=Apple, Z=876544567, true=A}
	  
	  h1.remove(200);
	  System.out.println(h1);
	  //{Sandhya=55.55, Z=876544567, true=A}
	 h1.clear();
	 System.out.println(h1); //{}
	 System.out.println(h1.isEmpty()); //true
}
}
