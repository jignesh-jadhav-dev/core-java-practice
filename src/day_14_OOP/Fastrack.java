package day_14_OOP;

public class Fastrack {
    String colour;
    String mat;
    int price;
    
	public Fastrack(String colour, String mat, int price) {
		this.colour = colour;
		this.mat = mat;
		this.price = price;
	}
    
    void details() {
    	System.out.println("Watch colour is "+colour
    			+" Material is "+mat+" Price is "+price);
    }
    
    public static void main(String[] args) {
		System.out.println("Fastrack start");
		
		Fastrack f1 = new Fastrack("Golden","Metal",15);
		f1.details();
		System.out.println("-----------");
		Fastrack f2 = new Fastrack("Black","Leather",20);
		f2.details();
		System.out.println("Fastrack End");
	}
}
