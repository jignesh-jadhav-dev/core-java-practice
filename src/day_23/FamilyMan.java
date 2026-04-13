package day_23;

public class FamilyMan {
  public static void main(String[] args) {
	
	  String str = new String("Rajesh");
	  str.concat("Riya");
	  System.out.println(str); //Rajesh
	  
	  System.out.println("------");
	  
	  StringBuffer s1 = new StringBuffer("Kunal");
	  s1.append("Jeny");
	  System.out.println(s1); //KunalJeny
	  
	  System.out.println("-------");
	  
	  StringBuilder s2 = new StringBuilder("Vishvesh");
	  s2.append("Geeta");
	  System.out.println(s2); //VishveshGeeta
	  
}
}
