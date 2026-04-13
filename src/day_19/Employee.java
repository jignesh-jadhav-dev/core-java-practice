package day_19;

public class Employee extends Person{
  
	int empid;
	double sal;
	String design;
	
	public Employee(String name, int age, char gen, int empid, double sal, String design) {
		super(name, age, gen);
		this.empid = empid;
		this.sal = sal;
		this.design = design;
	}
	
	@Override
	void info() {
		System.out.println("Employee name is "+name
				+" Age is "+age+" Gender is "+gen+" Empid :"+empid
				+"  Salary :"+sal+" Designation :"+design);
	}
	
}
