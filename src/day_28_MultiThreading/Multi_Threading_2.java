package day_28_MultiThreading;

// By implementing Runnable Interface

class MTask implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println("child Thread : "+i);
			try {
				Thread.sleep(450);
			} catch (InterruptedException e) {
				System.out.println("handeled");
			}
			
		}
		
	}
	
}
public class Multi_Threading_2 {
	public static void main(String[] args) {
		MTask m1 = new MTask();
		Thread t1 = new Thread(m1);
		t1.start();  
	
		for (int i = 1; i <=10; i++) {
			System.out.println("Main Thread : "+i);
			try {
				Thread.sleep(450);
			} catch (InterruptedException e) {
				System.out.println("handeled");
			}
			
		}
		
	}
}
