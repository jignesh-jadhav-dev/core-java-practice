package day_16_Inheritance;

class Champaklal {
	
	Champaklal(char ch , String s){
		System.out.println(ch+" "+s+" inside Champaklal Constructor");
	}
}

class Jhetalal extends Champaklal{

	Jhetalal(int a){
		super('A',"Bapuji");
		System.out.println(a+" Jhetalal Constructor...");
	}
		
}

class Tappu extends Jhetalal{	
	Tappu(String str){
		super(100);
		System.out.println(str+" Tappu Calss Constructor");
	}
}

public class TMKOC extends Object {
  public static void main(String[] args) {
	System.out.println("TMKOC start");
	
	Tappu t1 = new Tappu("Cycle");
	
	System.out.println("TMKOC End");
}
}
