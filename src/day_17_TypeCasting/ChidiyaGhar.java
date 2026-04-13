package day_17_TypeCasting;

public class ChidiyaGhar {
  public static void main(String[] args) {
	//widening
	  double i = 50;   //implictly
	  double j = (double)50; //explicitly
	  System.out.println(i); //50.0
	  System.out.println(j); //50.0
	  
	  //narrowing
	 // int a = 55.55; //error
	    int b = (int)95.76; //Explicitly
	    System.out.println(b); //95
}
}
