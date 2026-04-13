package day_24_COLLECTION;

import java.util.Vector;

class CyberCab {
	
    String colour;
    int speed;
    double bCap;
    
	public CyberCab(String colour, int speed, double bCap) {
		this.colour = colour;
		this.speed = speed;
		this.bCap = bCap;
	}
    
	@Override
	public String toString() {
		return "CyberCab colour:"+colour+" Speed :"+speed+" Battery capacity :"+bCap;
	}
}


public class Tesla {
   public static void main(String[] args) {
	
	   CyberCab c1 = new CyberCab("Black", 220, 5.5);
	   CyberCab c2 = new CyberCab("Red", 210, 4.5);
	   CyberCab c3 = new CyberCab("Blue", 190, 5.1);
	   CyberCab c4 = new CyberCab("Green", 170, 5.3);
	   CyberCab c5 = new CyberCab("Orange", 160, 4.8);
	   CyberCab c6 = new CyberCab("Grey", 1750, 3.5);
	   
	   Vector<CyberCab> a1 = new Vector<CyberCab>();
	   a1.add(c1);
	   a1.add(new CyberCab("Red", 210, 4.5));
	   a1.add(c3);
	   a1.add(c4);
	   a1.add(c5);
	   a1.add(c6);
	   
	   System.out.println(a1);
	   System.out.println("-------------");
	   
	   for(CyberCab cn : a1) {
		   System.out.println(cn);
	   }
}
}
