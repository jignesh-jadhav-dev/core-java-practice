package day_23;

public class Laila {
   public static void main(String[] args) {
	
	   String s1 = "Kunal";
	   String s2 = "Kunal";
	   String s3 = "Dhanashree";
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   System.out.println(s3.hashCode());
	   System.out.println(s1==s2); //true
	   System.out.println("--------");
	   String n1 = "MaLayALAm";
	   String n2 = "malAyAlAm";
	   System.out.println(n1==n2); //false
	   System.out.println(n1.equals(n2)); //false
	   System.out.println(n1.equalsIgnoreCase(n2)); //true
	   
	   System.out.println("--------------");
	   
	   
	   String str = "stunn hota sabi ke paas hai… sab stunn "
	   		+ "stunn chupa ke rakte hai";
	   String s4 = str.replace("stunn", "Dhan");
	   System.out.println(s4);
	   
	   
	 //  long l1 = 876543234567898887776L;
	   
	   float f1 = 876543234567898887776f;
	   System.out.println(f1);
	   
	   
}
}
