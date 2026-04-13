package day_14_OOP;

class Robot{
	
	String name;   //non-static global variable
	int mem ;
	double speed;
	
	
	void details() {
		System.out.println("Robo Name is  "+name
				+"  Memory is "+mem+" Tera Bit,  Speed is "+speed );
	}
}

public class Lab {
   public static void main(String[] args) {
	System.out.println("Lab start");
	
	Robot r1 = new Robot(); //Object 1
	r1.details();
	Robot r2 = new Robot(); //Object 2
	r2.details();
	System.out.println("--------");
	
	r1.name="Chitti";
	r1.mem=2;
	r1.speed=1.5;
	
	r2.name="Gone";
	r2.mem=4;
	r2.speed=0.8;
	
	  
	r1.details();
	r2.details();
	
	System.out.println("Lab End");
}
}
