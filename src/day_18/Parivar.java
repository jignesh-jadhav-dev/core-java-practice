package day_18;

class Father{
	
	int a = 100;
	
	void work() {
		System.out.println("Hard Working..");
	}
}

class Son extends Father{
	
	int x = 50;
	
	void study() {
		System.out.println("Studing..");
	}
}

public class Parivar {
   public static void main(String[] args) {
	
	   Father f1 = new Son();  //Upcasting
	   System.out.println(f1.a);
	   f1.work();
//	   System.out.println(f1.x);
//	   f1.study();
	   //When we do upcasting , Sub class properties are Hidden
	   
	   System.out.println("------");
	   
	   Son s1 = (Son)f1;   //Downcasting
	   System.out.println(s1.a);
	   s1.work();
	   System.out.println(s1.x);
	   s1.study();
	   
}
}
