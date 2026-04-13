package day_25_COLLECTION;

public class MoonLight {
  public static void main(String[] args) {
	
	  int a = 75;       //Boxing
	  Integer b = a;
	 //or Integer b = new Integer(a);
	  System.out.println(a); //75
	  System.out.println(b); //75 //non-primitive
	  System.out.println("---------");
	  
	  double d1 = 44.44;
	  Double d2 = new Double(d1);
	  System.out.println(d2); //44.44  //non-primitive
	 
	  System.out.println("-----------");
	  
	  //Unboxing
	  Character c1 = new Character('Z');
	  char c2 = c1;
	  System.out.println(c2); //Z //primitive
}
}
