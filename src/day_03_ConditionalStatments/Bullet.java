package day_03_ConditionalStatments;

public class Bullet {
  public static void main(String[] args) {
	
	  String email = "AniketSujata@gmail.com";
	  int pass = 5544 ;
	  
	  if(email == "AniketSujata@gmail.com" )
	  {
		  if(pass == 5544)
		  {
			  System.out.println("Login Successful");
		  }
		  else
		  {
			  System.out.println("Wrong Password");
		  }
	  }
	  else
	  {
		  System.out.println("Invalid EMail ID");
	  }
}
}
