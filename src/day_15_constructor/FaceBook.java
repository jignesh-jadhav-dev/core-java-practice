package day_15_constructor;

class User{    //Constructor Overloading
	
	String email;
	long phno;
	String pass;
	
	public User(String email, String pass) {
		System.out.println("Constructor 1...");
		this.email = email;
		this.pass = pass;
	}
	
	public User(long phno, String pass) {
		System.out.println("Constructor 2");
		this.phno = phno;
		this.pass = pass;
	}

	void details() {
		System.out.println("User Email ID is "+email
				+" Phno no is "+phno+"  Password is "+pass);
	}
}

public class FaceBook {
  public static void main(String[] args) {
	System.out.println("FB start");
	
	User u1 = new User("Aniket143@gmail.com", "Stark3000"); //Object
	u1.details();
	System.out.println("-----------");
	User u2 = new User(9876543456L, "Tushar@123"); //Object
	u2.details();
	System.out.println("FB End");
}
}
