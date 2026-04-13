package day_8_MethodCreation;

public class KFC {
	// 3 with return type without parameter
	public static int motu() {
		return 100;
	}
	
  public static void main(String[] args) {
	System.out.println("Main start");
	
	System.out.println(motu()); //100
	//directly printing the returned value
	
	System.out.println("------");
	
	int res = motu(); //100 //storing returned value in another var
	System.out.println(res);
	
	System.out.println("------");
	
	int ans = motu()+motu()+motu();
	System.out.println(ans);
	
	System.out.println("Main End");
}
}
