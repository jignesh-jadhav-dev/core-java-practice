package day_01_Operator;

public class Word {
	
	// relational operators
	
  public static void main(String[] args) {
	
	int a = 82;
	int b = 18;
	
	System.out.println((a+b)>=80); //true
	System.out.println(50>50); //false
	System.out.println(50>=50); //true
	System.out.println(90<=10); //false
	System.out.println("Rajesh"=="rajesh"); //false
	System.out.println("Rajesh"=="Rajesh"); //true
	System.out.println("----------------");
	System.out.println( 'A'==65 ); //true
	System.out.println( 'A'=='A' ); //true
	System.out.println( 'Z'!= 800); //true
	System.out.println(   50 != 50); //false
	System.out.println(   60 != 90); //true
	System.out.println( 55.55 > 55.54); //true
	System.out.println("--------------------------");
	System.out.println( 90=='Z'); //true
	System.out.println(   true == true); //true
	System.out.println(   false == false); //true
	System.out.println( ('a'==97) == true); //true
	System.out.println( "Sandhya"=="Varsha"); //false
	System.out.println( "Shreya"!="Kunal"); //true
}
}
