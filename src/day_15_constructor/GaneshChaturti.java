package day_15_constructor;

class Modak{  //Constructor Overrloading
	
	Modak(){
		System.out.println("A..Non-parameter Constructor");
	}
	
	Modak(int i){
		System.out.println("B..1 int Para Constructor");
	}
	
	
	Modak(double d){
		System.out.println("C..1 double Para Constructor");
	}
	
	Modak(int i , double d){
		System.out.println("D..2 int,double Para Constructor");
	}
	
	Modak(double a , int b){
		System.out.println("E..2 double,int Para Constructor");
	}
	
}

public class GaneshChaturti {
  public static void main(String[] args) {
	
	
	  Modak m1 = new Modak(67.56); //C..1 double Para Constructor
	  Modak m2 = new Modak(400 , 7.7);
	  Modak m3 = new Modak(8.5, 78);
	  Modak m4 = new Modak();
	  Modak m5 = new Modak(50);
	 
}
}
