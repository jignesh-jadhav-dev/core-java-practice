package day_28_MultiThreading;

// By creating class and extends with Thread

class Tom extends Thread{
	@Override
	public void run() {
		for (int t = 1; t <=10; t++) {
			System.out.println("T-->"+t);
			try {
				Thread.sleep(350);
				
			} catch (InterruptedException e) {
				System.out.println("handaled");
			}
			
		}
	}
}

class Jerry extends Thread{
	@Override
	public void run() {
		for (int j = 1; j <=10; j++) {
			System.out.println("J-->"+j);
			try {
				Thread.sleep(750);
				
			} catch (InterruptedException e) {
				System.out.println("handaled");
			}
			
		}
	}
}

class Oggy extends Thread{
	@Override
	public void run() {
		for (int o = 1; o <=10; o++) {
			System.out.println("O-->"+o);
			try {
				Thread.sleep(950);
				
			} catch (InterruptedException e) {
				System.out.println("handaled");
			}
			
		}
	}
}

public class Multi_Thread {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Tom t1 = new Tom();
		t1.start();
		System.out.println("---------------------------------");
		
		Jerry j1 = new Jerry();
		j1.start();
		System.out.println("---------------------------------");
		
		Oggy o1 = new Oggy();
		o1.start();
		System.out.println("---------------------------------");
		
		System.out.println("Main End");
	}
}
