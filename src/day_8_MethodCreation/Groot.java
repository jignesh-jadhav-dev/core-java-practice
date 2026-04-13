package day_8_MethodCreation;

public class Groot {
	//4 with return type with parameter method
		public static double area(double rad) {
			double res = 3.142*rad*rad;
			return res;
		}
			
	   public static void main(String[] args) {

		  double n = 9;
		   
		double ans = area(n);
		System.out.println("Area is "+ans);
		
		if(ans>0 && ans<=90) {
			System.out.println("Small Pizza");
		}else if(ans>90 && ans<=210) {
			System.out.println("Medium Pizza");
		}else if(ans>210){
			System.out.println("Large Pizza");
		}

	}
}
