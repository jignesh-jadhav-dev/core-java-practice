package day_01_Operator;

public class Coffee {
	
	// concate operation
	
   public static void main(String[] args) {
	
	  int x = 20;
	  int y = 30;
	  int z = 100;
	  char ch = 'A';
	  String s = "Zhill";
	  
	  System.out.println('A');
	  System.out.println('A'+0);  //65
	  System.out.println('#'+100);
	  System.out.println('#');  //#
	  System.out.println('#'+'A'); //100
	  System.out.println(' '+0); //32 space ascii value
	  System.out.println(x+y+z+ch+s+ch+x+y+z);
	                    //215ZhillA2030100
	  System.out.println('R'); //R
	  System.out.println("Rajesh"+0);
	  
	  System.out.println("----------------------------------------------");
	  
	  int a = 70;
	   int b = 50;
	   int c = 30;
	   String s1 = "Sujata";
	   
	   System.out.println(a+b+c);  //150
	   System.out.println(a+b+c+s1); //150Sujata
	   System.out.println(a+b+c+s1+a+b+c); //150Sujata705030
	      
	   System.out.println("Num is "+a);
	   System.out.println(30+80+"Rajesh"+80+90+70); 
	                    //110Rajesh809070
	   

		System.out.println("--------------------------------------");
			
		int a1 = 10;
		int b1 = 50;
		int c1 = 20;
		char ch1 = 'Z';
		String s11 = "Jeni";
		boolean bo1 = true;
		double d1 = 55.55;
			
		System.out.println(a1 + b1 + c1 + d1 + ch1 + s11 + bo1 + ch1 + a1 + b1 + c1);
		// 225.55JenitrueZ105020
		System.out.println("Jeni" + bo1); // Jenitrue
		// System.out.println(60+true); //CTE
	    // System.out.println(10+50+true); //CTE
		// System.out.println(a+b+bo+ch+s+a+b+c); //CTE

}
}
