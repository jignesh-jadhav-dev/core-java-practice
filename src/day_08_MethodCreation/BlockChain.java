package day_08_MethodCreation;

public class BlockChain {
	  //1 without return type without parameter method
	public static void dolly() {
		System.out.println("Dolly start");
		int i = 65;
		int j = 70;
		System.out.println(i+j+100);
		System.out.println("Dolly End");
	}
	
  public static void main(String[] args) {
	System.out.println("Main start");
	
	dolly();
	dolly();
	dolly();
	dolly();
	
	System.out.println("Main End");
  } 
}
