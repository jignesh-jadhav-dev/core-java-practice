package day_03_ConditionalStatments;

public class Rain {
   public static void main(String[] args) {
	
	   int a = 18;
	   int b = 70;
	   int c = 45;
	   
	   int max = (a>b)? ((a>c)?a:c) : ((b>c)?b:c) ;
	   System.out.println(max);
}
}
