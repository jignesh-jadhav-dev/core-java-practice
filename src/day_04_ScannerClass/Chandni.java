package day_04_ScannerClass;

public class Chandni {
  public static void main(String[] args) {
	
	  String food = "Burger";
	  
	  switch(food) 
	  {
	  case "PavBhaji","MisalPav" -> System.out.println(food+" 50 rupees");
	  case "Burger","Momos"      -> System.out.println(food+" 70 rupees");
	  case "Pizza"              -> System.out.println(food+" 100 rupees");
	  case "Pani Puri"         -> System.out.println(food +" 30 Rupees");
	  default -> System.out.println(food+" Not Available, Kal Ana.");
	  }
}
}
