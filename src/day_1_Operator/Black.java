package day_1_Operator;

public class Black {
	
	// unary operator
	
	public static void main(String[] args) {

		int i = 10;
		int j = i++ + --i - i-- + --i;

		System.out.println(i);
		System.out.println(j);

		int a = 20;
		int b = a++;
		System.out.println("A vlaue is " + a);
		System.out.println("B vlaue is " + b);
		
		System.out.println("--------");
		
		int i1 =5;
		int j1 = ++i1;
		System.out.println("I value is "+i1);
		System.out.println("J value is "+j1);
		
       System.out.println("--------");
		
		int m =15;
		int n = m--;
		System.out.println("M value is "+m);
		System.out.println("N value is "+n);
		
        System.out.println("--------");
		
		int x =10;
		int y = --x;
		System.out.println("X value is "+x);
		System.out.println("Y value is "+y);	

		System.out.println("------------------------");

		int v = 6;
		int m1 = 8;
		int p = v++ - --m1 + v++ - m1--;
		int q = p++ - v++ - m1-- + p++;

		System.out.println(v);
		System.out.println(m1);
		System.out.println(p);
		System.out.println(q);

		System.out.println("------------------------------");

		int g = 5;
		int h = -3;
		int a2 = g++ - h-- + g++ - --h;
		int b2 = ++g + a2++ - h-- + ++a2;
		int p2 = (g + h + a2 + b2) + 30;
		p2 += 20;
		p2 *= 2;

		System.out.println(g + " " + h + " " + a2 + " " + b2 + " " + p2);
	}
}
