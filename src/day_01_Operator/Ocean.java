package day_01_Operator;

public class Ocean {
	
	// unary operator
	
  public static void main(String[] args) {
	
	  int m = 7;
	  int n = m++ - ++m - m--;
	  System.out.println(n);
	  
	  int i = m++ - n-- - --n + n--;
	  System.out.println(i);
	  
	  int j = i++ + ++m + n-- - ++i;
	  System.out.println(j);
	  int k = (m+=20)+(i*=2)+(j/=10);
	  int p = k++ + 30;
	  k+=20;
	  p*=2;
	  
	  System.out.println(m+" "+n+" "+i+" "+j+" "+k+" "+p);
	  
}
}
