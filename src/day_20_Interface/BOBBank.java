package day_20_Interface;

public class BOBBank implements ATM1,ATM2,ATM3{

	int totalBal;  //non-static 
	
	@Override
	public void deposit(int amt1) {
		if(amt1>0) {
			totalBal+=amt1;  //totalBal = totalBal+amt1;
			System.out.println(amt1+" Deposited Successfully");
		}else {
			System.out.println("Enter Valid Number");
		}
	}

	@Override
	public void withdraw(int amt2) {
		if(amt2<= totalBal && amt2>0) {
			totalBal-=amt2;   //totalBal=totalBal-amt2;
			System.out.println(amt2+" Withdraw Successfull");
		}else {
			System.out.println("Tera Bap Chod Ke gaya tha ke Teri Ma..");
		}	
	}

	@Override
	public void checkBal() {
		System.out.println("Total available balanace is "+totalBal);
	}
   
	
}
