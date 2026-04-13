package day_23;

public class Majnu {
  public static void main(String[] args) {
	 
	  String str= "Software Engineer";
	  System.out.println(str.length()); //17
	  System.out.println(str.charAt(0)); //S
	  System.out.println(str.charAt(2)); //f
	  System.out.println(str.charAt(16)); //r
	  
	  System.out.println("-----");
	  System.out.println(str.toUpperCase());  //SOFTWARE ENGINEER
	  System.out.println(str.toLowerCase()); //software engineer
	  System.out.println(str.startsWith("Sof")); //true
	  System.out.println(str.startsWith("ware")); //false
	  System.out.println(str.endsWith("neer")); //true
	  System.out.println(str.endsWith("tware")); //false
	  System.out.println("------------");
	  
	  System.out.println(str.contains("twa")); //true
	  System.out.println(str.contains("gine")); //true
	  System.out.println(str.contains("re En")); //true
	  System.out.println(str.contains("WARE")); //false //Uppercase
	  
	  System.out.println("------");   //Software Engineer
	  System.out.println(str.indexOf("t")); //3
	  System.out.println(str.indexOf("S")); //0
	  System.out.println(str.indexOf("e")); //7
	  System.out.println(str.lastIndexOf("e")); //15
	  System.out.println(str.indexOf("e", 8)); //14
	  System.out.println(str.isEmpty()); //false
	  
	  System.out.println("-------");
	  String n = "";
	  System.out.println(n.isEmpty()); //true
	  
	  //Software Engineer
	  System.out.println(str.substring(4)); //ware Engineer
	  System.out.println(str.substring(10)); //ngineer
	  System.out.println(str.substring(3,7)); //twar
	 
}
}
