package day_16_Inheritance;
//Java bean Class , Encapsulation
public class Employee { //1 public class

	
	private String name;  //2 private attributes
	private int empid;
	private  double sal;
	
	//3 public constructor
	public Employee(String name, int empid, double sal) {
		this.name = name;
		this.empid = empid;
		this.sal = sal;
	}

	//4 public getters and setters method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getEmpid() {
		return empid;
	}
		
}
