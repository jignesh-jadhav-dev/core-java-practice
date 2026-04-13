package day_19;

public class Election {
	public static void main(String[] args) {
   System.out.println("Election start");
   
     Person p1 = new Person("Champaklal",65,'M');
     Student s1 = new Student("Kunal",21,'M',21,64.56,"BVMI");
     Student s2 = new Student("Tushar",25,'M',45,87.23,"PCE");
     Employee e1 = new Employee("Swati",23,'F',500, 150000,"SDE");
     Employee e2 = new Employee("Supriya",22,'F',700, 155000,"Java developer");
     Employee e3 = new Employee("Vishvesh",24,'M',650, 185000,"Promt Engineer");
     
     Government g1 = new Government();
     //Generalized method
     g1.aadhaarCard(p1);
     g1.aadhaarCard(s1);
     g1.aadhaarCard(new Student("Tushar",25,'M',45,87.23,"PCE"));
     g1.aadhaarCard(e1);
     g1.aadhaarCard(e2);
     g1.aadhaarCard(e3);
     
   System.out.println("-----------");
   //Specialization
   
   //  g1.scholarship(p1); //CTE
     g1.scholarship(s1);
     g1.scholarship(s2);
//     g1.scholarship(e1); 
//     g1.scholarship(e2);
//     g1.scholarship(e3);
   
     System.out.println("-----------");
     
//     g1.taxPayment(p1);
//     g1.taxPayment(s1);
//     g1.taxPayment(s2);
     g1.taxPayment(e1);
     g1.taxPayment(e2);
     g1.taxPayment(e3);
     
     System.out.println("------------");
     e1.info();
     e2.info();
     s1.info();
     s2.info();
     e3.info();
     
   System.out.println("Election End");	
	}
}
