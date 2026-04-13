package day_15_constructor;

public class Coin {
	
	static String name ;  //static var
	       int age ;   //non-static var
	       
	Coin(){   //constructor
		age=19;
		System.out.println("1 ..Inside Constructor");
	}
   
	static {   //static block 1
		name="Kunal";
		System.out.println("A...static block 1");
	}
	
	{        //non-static block 1
		age = 20;
		System.out.println("B...non-static block 1");
	}
	  
	static { //static block 2
		name="Shraddha";
		System.out.println("C...static block 2");
	}
	
	public static void main(String[] args) {
		System.out.println("D..Main start");
		
		System.out.println(name); //Sandya

		Coin c1 = new Coin(); //Object 1
		System.out.println(c1.age); //22
		
		System.out.println("--------------");
		
		Coin c2= new Coin(); //Object 2
		
		System.out.println("E..Main End");
	}
	
	{     //non-static block 2
		age = 22;   
		System.out.println("F...non-static block 2");
	}
	
	static {     //static block 3
		name="Sandya";
		System.out.println("G...static block 3");
	}
}
