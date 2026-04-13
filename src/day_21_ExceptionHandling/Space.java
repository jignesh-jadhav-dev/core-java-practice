package day_21_ExceptionHandling;

class Asia{
	int i=13;
	
	void oceans() {
		System.out.println("Indian ocean");
	}
}

class Earth{
	
	int c=7;
	
	void rotation() {
		System.out.println("Rotating in orbit");
	}
	
	Asia a1 = new Asia();
}

class SolarSystem{
	
	Earth e1 = new Earth();
	
	int p=9;
	void sun() {
		System.out.println("Hot Sun");
	}
	
}

class MilkyWay {
	
	SolarSystem s1 = new SolarSystem();
	
	int b=2;
	
	void stars() {
		System.out.println("2 Billion stars");
	}
	
}


public class Space {
  public static void main(String[] args) {
	System.out.println("Main start");
	
	MilkyWay m1 = new MilkyWay();
	System.out.println(m1.s1.e1.a1.i);
	m1.s1.e1.a1.oceans();
	
	System.out.println(m1.s1.e1.c);
	m1.s1.e1.rotation();
	
	System.out.println("Main End");
}
}
