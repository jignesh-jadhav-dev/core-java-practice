package day_22_StringClass;
   //2 After Overriding .equals()
class Robot{
	
	String name;
	int speed;
	
	public Robot(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}	
	  
	@Override                 //Object obj = new Robot("Chitti", 1);  //Upcasting
	public boolean equals(Object obj) {
		Robot r1 = (Robot)obj; //Downcasting
		return  this.speed==r1.speed;
	}
	
//	@Override                 //Object obj = new Robot("Chitti", 1);  //Upcasting
//	public boolean equals(Object obj) {
//		Robot r1 = (Robot)obj; //Downcasting
//		return  this.name.equals(r1.name);
//	}	
}

public class Bot {
   public static void main(String[] args) {
	
	   Robot r1 = new Robot("Chitti", 5);
	   Robot r2 = new Robot("RaOne", 5);
	   
	   System.out.println(r1.equals(r2)); //true
	   //now .equals() is Overrideen to compare speed not address
	   //or
	   //System.out.println(r1.equals(new Robot("Chitti", 1)));  
	   
	   //.equals() will compare address by default 
	       //,but we can override to compare data  
}
}
