package day_22_StringClass;

class ECG{
	
	String e;

	public ECG(String e) {
		this.e = e;
	}	
}

public class Diagnostics {
   public static void main(String[] args) {
	
	   ECG e1 = new ECG("A");
	   System.out.println(e1.hashCode()); //617901222
	   
	   System.out.println("-----");
	   
	  String s1 = new String("A");
	  System.out.println(s1.hashCode()); //65
}
}
