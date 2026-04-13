package day_26_MAP;

import java.util.HashMap;

public class RobinHood {
  public static void main(String[] args) {
	
	  HashMap<Character,String> h1 = new HashMap<Character,String>();
	  h1.put('K',"Kunal");
	  h1.put('K',"Jeni");
	  h1.put('S',"Sandhya");
	  h1.put('V',"Vishvesh");
	  h1.put('B',"Bhavika");
	  h1.put('S',"Swati");
	  h1.put('D',"DhanaShree");
	  
	  System.out.println(h1);
	  //{B=Bhavika, S=Swati, D=DhanaShree, V=Vishvesh, K=Jeni}

	  System.out.println(h1.size()); //5
	  
}
}
