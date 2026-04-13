package day_14_OOP;

public class Thar {
  
	String colour="White"; //non-static global variables
	int speed = 250;
	double cost = 13.34;
	
	void info() {  //non-static method
	  System.out.println("Car colour is "
	           +colour+" Speed is "+speed+" cost :"+cost);	
	}
}
