package day_22_StringClass;

class  Graphics{  //2  .equals()
	
	String str;

	public Graphics(String str) {
		this.str = str;
	}
}

public class RTX {
  public static void main(String[] args) {
	
	  Graphics g1 = new Graphics("Gold");
	  Graphics g2 = new Graphics("Gold");
	  System.out.println(g1.equals(g2)); //false
	  
	  System.out.println("-----");
	  
	  String s1 = new String("Vishvesh");
	  String s2 = new String("Vishvesh");
	  System.out.println(s1.equals(s2)); //true
}
}
