package day_26_MAP;

import java.util.Set;
import java.util.TreeMap;

class Person{
	String name;
	int age ;
	char gen;
	String dob;	
	//Constructor
	public Person(String name, int age, char gen, String dob) {
		this.name = name;
		this.age = age;
		this.gen = gen;
		this.dob = dob;
	}	
	@Override
	public String toString() {
		return "Person Name is "+name+" Age is "+age
				+"  Gender is "+gen+"  DOB is "+dob;
	}
}
public class GovAadhaarCard {
   public static void main(String[] args) {	
	   Person p1 = new Person("Kunal",21,'M',"2nd Oct");
	   Person p2 = new Person("Vishvesh",22,'M',"2nd Feb");
	   Person p3 = new Person("Rajesh",21,'M',"2nd March");
	   Person p4 = new Person("Bhavika",21,'F',"April");
	   Person p5 = new Person("Shreya",21,'F',"5th March");
	   Person p6 = new Person("Supriya",21,'F',"6th Dec");
	   Person p7 = new Person("Shraddha",21,'F',"11th Sept");
	   Person p8 = new Person("DhanaShree",21,'F',"19th Nov");
	   Person p9 = new Person("Swati",21,'F',"5th Oct");
	   Person p10 = new Person("Shruti",21,'F',"8th May");
	   
	   TreeMap<Long ,Person>  t1 = new TreeMap<Long,Person>();
	   t1.put(10045L, p1);
	   t1.put(10039L, p2);
	   t1.put(10078L, new Person("Rajesh",21,'M',"2nd March"));
	   t1.put(10007L, p4);
	   t1.put(10017L, p5);
	   t1.put(10021L, p6);
	   t1.put(10026L, p7);
	   t1.put(10084L, p8);
	   t1.put(10063L, p9);
	   t1.put(10072L, p10);
	   
	   System.out.println(t1);
	   
	   Set<Long> s1 = t1.keySet();
	   
	   for(Long  n : s1) {
		   System.out.println(n+"--->"+t1.get(n));
	   }
	     
}
}
