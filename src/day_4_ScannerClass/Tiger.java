package day_4_ScannerClass;

public class Tiger {
  public static void main(String[] args) {
	
	  char gen = 'A';
	  
	  switch(gen)
	  {
	  case 'M','m',65 : {
		  System.out.println("Mard");
	   }
	  break;
	  
	  case 'F','f' : System.out.println("Stree");
	  break;
	  
	  case 'O','o' : System.out.println("Orry Wale log");
	  break;
	  
	  default : System.out.println("Invalid Gender");
	  }
}
}
