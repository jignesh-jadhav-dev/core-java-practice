package day_17_TypeCasting;

public class Christmas {  //non-static Method Overloading
	
	 void tree() {  //non-static method
		System.out.println("A..Empty christmas tree");
	}
	
	 void tree(int a) {
		System.out.println("B..1 int para christmas tree");
	}
	
	 void tree(String s) {
		System.out.println("C..1 String para christmas tree");
	}
	
	 void tree(int x , boolean b) {
		System.out.println("D..2 int,boolean para christmas tree");
	}
	
      void tree(boolean i , int j) {
		System.out.println("E..2 boolean,int para christmas tree");
	}
	
	
  public static void main(String[] args) {
	System.out.println("Christmas start");
	
	Christmas c1 = new Christmas();
	c1.tree();
	c1.tree(200);
	c1.tree(50, true);
	
	System.out.println("Christmas End");
  }
}
