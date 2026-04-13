package day_27_SingleThreading;

public class myThread1 implements Runnable{
	
	// By Implementing Runnable Interface(this is better in real project)

	@Override
	public void run() {
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) {
		myThread1 mt1 = new myThread1();
		
		Thread t = new Thread(mt1);
		t.start();
	}
	

}
