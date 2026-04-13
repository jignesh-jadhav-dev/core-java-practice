package day_17_TypeCasting;

class Person{     //Constructor Chaining
	
	String name;
	int age ;
	char gen;
	
	public Person(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
}

class Student extends Person{

	int roll;
	double per;
	String college;
	
	public Student(String name, int age, char gen, int roll, double per, String college) {
		super(name, age, gen);
		this.roll = roll;
		this.per = per;
		this.college = college;
	}	
}

class Employee extends Person{
	
	int empid;
	double sal;
	String design;
	
	public Employee(String name, int age, char gen, int empid, double sal, String design) {
		super(name, age, gen);
		this.empid = empid;
		this.sal = sal;
		this.design = design;
	}		
}


public class Scam1992 {
   public static void main(String[] args) {
	
	   Student s1 = new Student("Ganesh",23,'M',21,95.53, "BVIMIT");
	   System.out.println(s1.name);
	   System.out.println(s1.per);
	   System.out.println(s1.gen);
	   
	   System.out.println("-----------");
	   
	   Employee e1 = new Employee("Tushar",25,'M',700,95000,"SDE");
	   System.out.println(e1.name);
	   System.out.println(e1.design);
	   System.out.println(e1.sal);
}
}
