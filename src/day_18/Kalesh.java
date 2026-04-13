package day_18;

class Papa{
	
}

class Aniket extends Papa{
	
}

class Ritu extends Papa{
	
}

public class Kalesh {
  public static void main(String[] args) {
	System.out.println("Main start");
	
	  Papa p1 = new Aniket(); //Upcasting..
	  Ritu r1 =(Ritu) p1; //Downcasting
	            //ClassCastException
	  System.out.println("Main End");  
}
}
