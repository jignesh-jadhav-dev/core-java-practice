package day_25_COLLECTION;

import java.util.Stack;

public class Chakli {
   public static void main(String[] args) {
	
	   Stack<Object> s1 = new Stack<Object>();
	   s1.add(786);
	   s1.push("Mona");
	   s1.push("Rajesh");
	   s1.push(true);
	   s1.push("Vishvesh");
	   s1.push("Kunal");
	   
	   System.out.println(s1.get(4));
	   System.out.println("---------");
	   System.out.println(s1);
	   System.out.println(s1.search("Rajesh")); //4
	   System.out.println(s1.search("Kunal")); //1
	   
	   System.out.println("---------");
	   System.out.println(s1.peek()); //kunal
	   System.out.println("----------");
	   System.out.println(s1);
	   //[786, Mona, Rajesh, true, Vishvesh, Kunal]
	   
	   s1.pop();
	   s1.pop();
	   s1.pop();
	   System.out.println(s1);
	   //[786, Mona, Rajesh]
	   
	   System.out.println("-------------");
	   System.out.println(s1.peek());  //Rajesh
	   System.out.println("-------");
	   System.out.println(s1.empty()); //false
	   s1.clear();
	   System.out.println(s1); //[]
	   System.out.println(s1.empty()); //true
	   
	   
}
}
