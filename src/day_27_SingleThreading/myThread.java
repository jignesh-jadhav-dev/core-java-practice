package day_27_SingleThreading;

public class myThread extends Thread {

	// by extending thread class
	
	@Override
	public void run() {
		System.out.println("Thread Is running");
	}
	public static void main(String[] args) {
		myThread mt = new myThread();
		mt.start();
	}
}
