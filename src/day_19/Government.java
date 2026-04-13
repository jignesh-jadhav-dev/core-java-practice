package day_19;

public class Government {
   
	//generalized method    // Person p = new Student("Tushar",25,'M',45,87.23,"PCE")
	public void aadhaarCard(Person p) {
		System.out.println(p.name+" Will get AadhaarCard ");
	}
	
	
	//specialized
	public void scholarship(Student s) {
		if(s.per >= 70) {
			System.out.println(s.name+" is eligible to get ScholarShip");
		}else {
			System.out.println(s.name+" Padaye Pe dhayn do , reels kam karo");
		}
	}
	
	
	public void taxPayment(Employee e) {
		if(e.sal*12 >= 1200000) {
			System.out.println(e.name+" Should pay tax");
			System.out.println("Tax payable is 18% "+(e.sal*12*0.18)+" /rs Only");
		}else {
			System.out.println(e.name+"  Tax dene Ke Jarurat Nahi hai");
		}
	}
	
}
