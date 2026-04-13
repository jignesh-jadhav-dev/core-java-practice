package day_7;

public class Zudio {
  public static void main(String[] args) {
	
	  String str = "MaLAYalAm";
	  String rev = "";
	  
	  for(int i=str.length()-1; i>=0;i--) {
		  rev = rev+str.charAt(i);
	  }
	  
	  System.out.println("Reverse is "+rev);
	  
	  if(str.equalsIgnoreCase(rev)) {    //or str.equals(rev)
		  System.out.println(str+" is Palindrome");
	  }else {
		  System.out.println(str+" is Not-Palindrome");
	  }
	  
}
}
