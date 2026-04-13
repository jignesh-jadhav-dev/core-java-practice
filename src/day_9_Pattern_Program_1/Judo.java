package day_9_Pattern_Program_1;

public class Judo {
	public static void main(String[] args) {

		for (int r = 1; r <= 5; r++)
		{
			for (int c = 1; c <= 5; c++) 
			{
				if((r+c)%2 ==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
