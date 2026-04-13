package day_20_Interface;

public class User {
   public static void main(String[] args) {
	System.out.println("Main start");
	
     ATM1 u1 = new BOBBank();  //Upcasting	
     u1.checkBal();
     u1.deposit(50000);
     u1.checkBal();
     u1.withdraw(20000);
     u1.checkBal();
     u1.deposit(-7000);
	u1.withdraw(3000);
	u1.checkBal();
	
	System.out.println("----------");
	
	ATM2 u2 = new BOBBank();
	u2.checkBal();
	u2.deposit(15000);
	u2.withdraw(2000);
	u2.checkBal();
	u2.withdraw(20000);	
	
	System.out.println("Main End");
}
}
