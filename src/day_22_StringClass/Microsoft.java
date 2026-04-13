package day_22_StringClass;

class Intel{    //1 toString()
	
	String s;

	public Intel(String s) {
		this.s = s;
	}	
}

public class Microsoft {
  public static void main(String[] args) {
	
	  Intel i1 = new Intel("Threads"); //non-String class Object
	  System.out.println(i1); //box22.Intel@24d46ca6
	  System.out.println(i1.toString()); //box22.Intel@24d46ca6
	  
	  System.out.println("------");
	  
	  String s1  = new String("Swati"); //String Object
	  System.out.println(s1);  //Swati
	  System.out.println(s1.toString()); //Swati
}
}
