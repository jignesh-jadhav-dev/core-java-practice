package day_17_TypeCasting;

class Animal{
	
	void eat() {
		System.out.println("All animal Eat Food ");
	}
	
	void drink() {
		System.out.println("All anaimals Drink H2O");
	}
	
	void sleep() {
		System.out.println("All animal sleep at night");
	}
	
	void breathe() {
		System.out.println("All animal Breathe O2");
	}
	
	void sound() {
		System.out.println("All animal Makes sound");
	}
}

class Dog extends Animal{
	
	@Override
	void sound() {
		System.out.println("Bhaww..Bhawww");
	}
}

class Cat extends Animal{
	
	@Override
	void sound() {
		System.out.println("Meoww..Meoww..");
	}
}

class Snake extends Animal{
	
	@Override
	void sound() {
		System.out.println("Hiss..Hisss..");
	}
}


public class RaniBaug {
  public static void main(String[] args) {
	
	  Animal a1 = new Dog(); //Upcasting
	  a1.sound();
}
}
