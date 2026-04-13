package day_22_StringClass;

//2 After Overriding hashCode()
class Demogorgan{
	
	static int num = 143;
	
	@Override
	public int hashCode() {
		return num++;
	}
}

public class StrangerThings {
   public static void main(String[] args) {
	

	   Demogorgan d1 = new Demogorgan();
	  System.out.println(d1.hashCode()); //143
	  
	  System.out.println("----------");
	  
	  Demogorgan d2 = new Demogorgan();
	  System.out.println(d2.hashCode());  //144
 
	  System.out.println("----------");
	  
	  Demogorgan d3 = new Demogorgan();
	  System.out.println(d3.hashCode());  //145
}
}
