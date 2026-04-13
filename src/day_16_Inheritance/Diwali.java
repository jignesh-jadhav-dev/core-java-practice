package day_16_Inheritance;

class Granny{   //MultiLevel Inheritance
	
	void pyar() {
		System.out.println("Ajji ka Pyar");
	}
}

class Mom extends Granny{
	
	void care() {
		System.out.println("caring..");
	}
}

class Sandhya extends Mom{
	
	void jagda(){
		System.out.println("Mummy se jagda..");
	}
}

public class Diwali {
  public static void main(String[] args) {
	
	  Granny g1 = new Granny();
	  g1.pyar();
//	  g1.care();
//	  g1.jagda();
	  
	  System.out.println("--------");
	  
	  Mom m1 = new Mom();
	  m1.pyar();
	  m1.care();
	 // m1.jagda();
	  System.out.println("-------");
	  
	  Sandhya  s1 = new Sandhya();
	  s1.pyar();
	  s1.care();
	  s1.jagda();
	 
	  
}
}
