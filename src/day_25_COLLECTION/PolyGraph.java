package day_25_COLLECTION;

import java.util.TreeSet;

public class PolyGraph {
	public static void main(String[] args) {

		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Rajesh");
		t1.add("Bhavika");
		t1.add("Bhavika");
		t1.add("Supriya");
		t1.add("Shreya");
		t1.add("Kunal");
		t1.add("Shreya");
		t1.add("Vishvesh");
		t1.add("Sandhya");
		t1.add("Rajesh");
		t1.add("Dhanashree");
		t1.add("Abhishek");
		t1.add("Abhay");
		t1.add("Zahid");
		
		System.out.println(t1);
		//[Abhay, Abhishek, Bhavika, Dhanashree, Kunal, Rajesh, 
		                              //Sandhya, Shreya, Supriya, Vishvesh, Zahid]
		//alphabetical Order


	}
}
