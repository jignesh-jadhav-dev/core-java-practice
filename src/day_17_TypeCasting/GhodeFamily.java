package day_17_TypeCasting;

class Father{
	
	 void house() {
		System.out.println("2 floor building");
	}
}

class Kunal extends Father{
	
	@Override
	void house() {
		System.out.println("4 floor building, Roof Top Garden");
	}
	
	void house(int a) {
		System.out.println("Mandap ...");
	}
}

public class GhodeFamily {
  public static void main(String[] args) {
	
	 Kunal k1 = new Kunal();
	 k1.house();
}
}
