package day_1_Operator;

public class PaniPuri {
	
	// assignment operator
	
  public static void main(String[] args) {
	
	  int m = -5;
	  int n = (m-=10);
	  int p =(n+=m);
	  int q = (p*=2)+(m+=30);
	  int r = (m+n+p+q);
	  
	  System.out.println(m);
	  System.out.println(n);
	  System.out.println(p);
	  System.out.println(q);
	  System.out.println(r);


		System.out.println("--------------------------");

		int a = 10;
		int b = -5;
		int c = (a += 50) + (b -= 30);
		int d = (a + b + (c *= 2));
		int e = (a += b) + (b -= d) + 500;
		int f = (e %= 2) + (d /= 50) + (c *= 10);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(f);

		System.out.println("-----------------------------");

		int a1 = 30;
		int b1 = 25;

		a1 += 50;
		b1 -= 30;
		a1 += 400;
		a1 /= 5;
		b1 *= 2;
		b1 += 300;

		System.out.println(a1);
		System.out.println(b1);
}
}
