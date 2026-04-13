package day_24_COLLECTION;

import java.util.Vector;
    //Example of list interface
public class Coffee {
   public static void main(String[] args) {
	
	 Vector<Object> v1 = new Vector<Object>(); 
	 v1.add("Kunal");
	 v1.add(786);
	 v1.add("Rajesh");
	 v1.add(55.55);
	 v1.add("Vishvesh");
	 
	 System.out.println(v1);
	 System.out.println(v1.contains("Shreya")); //false
	 System.out.println(v1.contains("Kunal")); //true
	 System.out.println("------------");
	 //[Kunal, 786, Rajesh, 55.55, Vishvesh]
	 System.out.println(v1.size()); //5
	 System.out.println(v1.indexOf("Kunal"));  //0
	 System.out.println(v1.indexOf("Vishvesh")); //4
	 System.out.println(v1.get(2)); //Rajesh
	 System.out.println(v1.get(3)); //55.55
	 v1.remove(1); //index
	 v1.remove(55.55); //data
	 v1.remove("Rajesh"); //data
	 
	 System.out.println(v1); //[Kunal, Vishvesh]
	 
	 System.out.println(v1.isEmpty()); //false
	 v1.clear();
	 System.out.println(v1); //[]
	 System.out.println(v1.isEmpty()); //true 
}
}
