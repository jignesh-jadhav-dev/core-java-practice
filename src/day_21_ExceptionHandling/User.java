package day_21_ExceptionHandling;

class Battery{
	int n = 10;
	
	void capacity() {
		System.out.println("8000 MAH battery");
	}
	
	void capacity(int a) {
		System.out.println("12000 MAH battery");
	}
}

class Mobile {
	
  static Battery b1 = new Battery();
  
    int i = 200;
    void games() {
    	System.out.println("Candy Crush..");
    }
	
}
public class User {
public static void main(String[] args) {
	
	Mobile m1 = new Mobile();
	System.out.println(m1.i);
	m1.games();
	System.out.println(m1.b1.n);
	m1.b1.capacity();
	Mobile.b1.capacity();
	Mobile.b1.capacity(50);
	
	System.out.println("------");
	
	System.out.println();
	
	//System is a Builtin class
	//out is a static refernce of Printstream class
	//println  --> overloaded method of printstream class
}
}
