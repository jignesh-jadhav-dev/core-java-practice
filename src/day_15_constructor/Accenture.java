package day_15_constructor;

class Employee{
	
	     String name;
	final String empid;
	     double sal;
	private static int randomnum = 700;     
		
	public Employee(String name, double sal) {
		this.name = name;
		this.empid = "2025ACC"+ randomnum++;
		this.sal = sal;
	}

	void info() {
		System.out.println("Employee name is "+name
				+" EMpID is "+empid+" Salary is "+sal);
	}
	
}

public class Accenture {
  public static void main(String[] args) {
	System.out.println("Accenture start");
	
	 Employee e1 = new  Employee("Tushar" ,85000);
	 Employee e2 = new  Employee("Kunal", 98000);
	 Employee e3 = new  Employee("Supriya" ,95000);
	 Employee e4 = new  Employee("Shraddha", 90000);
	 Employee e5 = new  Employee("Sandya", 110000);
	 Employee e6 = new  Employee("Sanu", 80000);
	 
	 Employee e7 = new  Employee("Rajesh", 82000);
	 
//	 e6.empid=501;
//	 e2.empid=505;
	 
	 System.out.println("-----------");
	 e1.info();
	 e2.info();
	 e3.info();
	 e4.info();
	 e5.info();
	 e6.info();
	 e7.info();
	
	System.out.println("Accenture End");
}
}
