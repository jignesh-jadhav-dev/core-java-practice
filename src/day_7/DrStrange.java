package day_7;

public class DrStrange {
  public static void main(String[] args) {
	
	  String str = "Tere Naam **++ 99";
		 System.out.println(str.length());
		 int uCount=0;
		 int lCount=0;
		 int nCount=0;
		 int sCount=0;
		 
		 
		 for(int i=0; i<str.length(); i++)
		 {
			char ch = str.charAt(i);
			
			if(ch>=65 && ch<=90 ) {
				uCount++;
			}else if(ch>=97 && ch<=122) {
				lCount++;
			}else if(ch>=48 && ch<=57) {
				nCount++;
			}else {
				sCount++;
			}
		 }
		 
		 System.out.println("Total UpperCase :"+uCount);
		 System.out.println("Total LowerCase :"+lCount);
		 System.out.println("Total numbers :"+nCount);
		 System.out.println("Total Special Chars :"+sCount);
}
	
}
