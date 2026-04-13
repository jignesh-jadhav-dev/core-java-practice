package day_21_ExceptionHandling;
          //ClassCastException
class Father{	
}
class Son extends Father{	
}

class Daughter extends Father{	
}

public class Charges {
   public static void main(String[] args) {
	System.out.println("Main start");
	
	Father f1 = new Son();  //Upcasting
	try {
	Daughter d1 = (Daughter)f1;  //Downcasting
	}catch(ClassCastException c1) {
		System.out.println("Kand Kese Aur ne Kiya hai");
	}
	
	System.out.println("Main End");
}
}
