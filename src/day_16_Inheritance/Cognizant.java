package day_16_Inheritance;

public class Cognizant {
   public static void main(String[] args) {
	System.out.println("Cognizant start");
	
	Employee e1 = new Employee("Aniket",500,120000);
//	System.out.println(e1.name);
//	System.out.println(e1.empid);
//	System.out.println(e1.sal); 
	  //all are private
	
	System.out.println(e1.getName()); //Aniket
	
	//e1.name="Yo Yo Aniket"; //private
	
	e1.setName("Yo Yo Aniket");
	System.out.println(e1.getName());  //Yo Yo Aniket
	
	System.out.println(e1.getEmpid());
	System.out.println("Cognizant End");
}
}
