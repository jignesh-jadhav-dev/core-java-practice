package day_1_Operator;

public class PuranPoli {
	
	// logical operator
	
  public static void main(String[] args) {
	
	  int m = 5;
	  int n = 7;
	  
	  System.out.println(5>7 || 'a'==97); //true
	  System.out.println( 50!=20 && 'A'==65); //true
	  System.out.println(90==70 || "Varsha"!="Sandhya"); //true
	  System.out.println( 55.55<55.56  && (50*4 ==200)); //true
	  System.out.println( ('A'==65 && (60<=10))); //false
	  System.out.println("------------");
	  System.out.println(  true && false); //false
	  System.out.println(  true && true); //true
	  System.out.println(  !(true)); //false
	  System.out.println(  !(false)); //true
	  System.out.println( !(50>40)); //false
	  System.out.println("---------");
	  System.out.println( 60*5+500/20+5*4+200 >=5600 && (100+120)*2 <=250); //false
	  System.out.println((40*5+700*4)+155+(90+80) >=9800  || ('A'+100)>='Z'); //true
	  System.out.println( "Rajesh"=="rajesh" || 'A'+'A'==130 ); //true
	  System.out.println( "Rajesh"=="rajesh" && 'A'+'A'==130 ); //false
	  
		System.out.println("-----------------------------------");

		char gen = 65;

		if (gen == 'M' || gen == 'm' || gen == 65) {
			System.out.println("Mard..");
		} else if (gen == 'F' || gen == 'f') {
			System.out.println("Stree..");
		} else if (gen == 'O' || gen == 'o') {
			System.out.println("Orry Wale Log..");
		} else {
			System.out.println("Invalid Gender");
		}
}
}
