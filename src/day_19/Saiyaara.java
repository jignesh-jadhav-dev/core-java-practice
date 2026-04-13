package day_19;

interface Raaz{    //interface
	
	public static final int a=10;
	                    int b=20;
//by default variables are public static and final
	                    
	public abstract  void kill();  
	                 void revenge(); //by default methods public abstract
}

class TwoStates{  //concrete class
	
	static  int i ;
	        int j;	
	        
	        void dance() {
	        	  System.out.println("Concrete method");
	        }
}

public class Saiyaara {
  public static void main(String[] args) {
	System.out.println("Main start");
	
	System.out.println(Raaz.a); //10
	System.out.println(Raaz.b); //20
	System.out.println(TwoStates.i); //0
	   //System.out.println(TwoStates.j); //CTE non-static
	
	System.out.println("Main End");
}
}
