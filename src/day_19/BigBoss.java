package day_19;

interface Kantara{
	
	public abstract void fight();   //by default public abstract
	               void rakshas();
}

class Berme implements Kantara {

	@Override
	public void fight() {
		System.out.println("hath se fight");
	}

	@Override
	public void rakshas() {
		System.out.println("Chilana...");
	}

}

public class BigBoss {
   public static void main(String[] args) {
	
	   Kantara k1 = new Berme(); //Upcasting..
	   k1.fight();
	   k1.rakshas();
}
}
