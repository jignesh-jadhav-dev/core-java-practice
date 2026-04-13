package day_28_MultiThreading;

public class Multi_Thread_1 {
	
	public static void main(String[] args) {
		
		int count =0;
		while (true) {
			new Thread(() -> {try {
				Thread.sleep(Long.MAX_VALUE);
			} catch (InterruptedException e) {
				System.out.println("handeled");
			}}).start();
			count ++;
			System.out.println("Thread created : "+count);
		}
	}

}
