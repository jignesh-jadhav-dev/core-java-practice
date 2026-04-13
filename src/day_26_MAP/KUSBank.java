package day_26_MAP;

class Account{
	
	  //full object -->private static Account obj = new Account();
	
	private static Account obj; //half object
	
	private Account(){    //private constructor
		System.out.println("Account Created Successfully");
	}
	
	//helper method
	public static void createObject() {
		if(obj==null) {
			obj= new Account();
		}else {
			System.out.println("KUS Account Already Exists");
		}
	}
	
}

public class KUSBank {
   public static void main(String[] args) {
	
	  // Account a1 = new Account();  //CTE 
	   //we cannot create Ovject Outside class as
	              //constructor is private
	   
	   Account.createObject();
	   Account.createObject();
	   Account.createObject();
	   Account.createObject();
	   
	   
}
}
