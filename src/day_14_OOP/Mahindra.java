package day_14_OOP;

public class Mahindra {
  public static void main(String[] args) {
	
	  Thar t1 = new Thar(); //Object 1
	  System.out.println(t1);
	  Thar t2 = new Thar(); //Object 2
	  System.out.println(t2);
	  Thar t3 = new Thar(); //Object 2
	  System.out.println(t3);
	  
	  System.out.println("-------");
	  t1.colour="Black";
	  t2.speed = 240;
	  t2.cost = 15.64;
	  
	  t1.info();
	  t2.info();
	  t3.info();
	  
}
}
