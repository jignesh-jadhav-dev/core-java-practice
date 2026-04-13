package day_08_MethodCreation;

public class PubG {
	
	//4 with return type with parameter method
	public static double area(double rad) {
		double res = 3.142*rad*rad;
		return res;
	}
		
   public static void main(String[] args) {
	System.out.println("Main start");
	
	System.out.println(area(5)); //78.55
	
	System.out.println("-------");
	
	double ans = area(7);
	System.out.println(ans);  //153.958
	
	System.out.println("Main End");
}
}
