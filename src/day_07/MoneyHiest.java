package day_07;

public class MoneyHiest {
   public static void main(String[] args) {
	
	   String s = "Kunal";
	   String rev ="";
		            //or i<=s.length()-1
	   for(int i=0; i<s.length(); i++)
	   {
		  rev = s.charAt(i)+rev; 
	   }
	   
	   System.out.println(rev);
}
}
