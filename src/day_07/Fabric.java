package day_07;

public class Fabric {
  public static void main(String[] args) {
	
	 String str = "Tere Naam";
	 System.out.println(str.length());
	 int uCount=0;
	 int lCount=0;
	 
	 
	 for(int i=0; i<str.length(); i++)
	 {
		char ch = str.charAt(i);
		
		if(ch>=65 && ch<=90 ) {
			uCount++;
		}else if(ch>=97 && ch<=122) {
			lCount++;
		}	
	 }
	 
	 System.out.println("Total UpperCase :"+uCount);
	 System.out.println("Total LowerCase :"+lCount);
}
}
