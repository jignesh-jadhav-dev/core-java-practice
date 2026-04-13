package day_21_ExceptionHandling;

class BMW{
	
	int speed = 180;	
}
public class Enduring {
 public static void main(String[] args) {
	 System.out.println("Main start");

	 try {
	 BMW b1 = null; 
	    //b1= new BMW(); 
	 System.out.println(b1.speed);
	 }catch(NullPointerException n1) {
		 System.out.println("Nalle kuch nahi hai Waha Pe");
	 }
	 System.out.println("Main End");
}
}
