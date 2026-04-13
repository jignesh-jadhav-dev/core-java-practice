package day_14_OOP;

class Samsung{
	
	String colour; //non-static global var
	int ram;
	int storage ;
	
     Samsung(String c,int r,int s){  //Constructor
    	 colour = c;
    	 ram = r;
    	 storage= s;
    	 System.out.println("Inside Samsung Constuctor");
	}
		
  	void info() { //non-static method
		System.out.println("Mobile colour is "+colour
				+" Ram is "+ram+"  Storage is "+storage);
	}	
}

public class GreenLeaf {
  public static void main(String[] args) {
	System.out.println("Main start");
	
	Samsung s1 = new Samsung("Black",8, 128); //Object 1
	s1.info();
	System.out.println("---------");
	Samsung s2 = new Samsung("Blue",12, 256); //Object 2
	s2.info();
	System.out.println("-------");
	Samsung s3 = new Samsung("Gold",16,256);
	s3.info();
	System.out.println("Main End");
}
}
