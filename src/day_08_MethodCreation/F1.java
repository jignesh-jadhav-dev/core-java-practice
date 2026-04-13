package day_08_MethodCreation;

public class F1 {
	
	public static double per(double eng, double mar
			,double hin,double math,double sst,double sci) {		
		return ((eng+mar+hin+math+sst+sci)/625)*100;
	}
	
	
	public static int square(int n) {
		return n*n;
	}
	
	
  public static void main(String[] args) {
	System.out.println("Main start");
	
	double res = per(75,88,85,35,47,92);
	System.out.println("Students percentage is "+res);
	
	System.out.println("----------");
	
	System.out.println(square(5));
	System.out.println(square(9));
	System.out.println(square(8));
	System.out.println(square(3));
	System.out.println("Main End");
}
}
