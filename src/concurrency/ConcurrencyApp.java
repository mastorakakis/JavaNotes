package concurrency;

public class ConcurrencyApp {

	public static void main(String[] args) {
		System.out.println("Main Thread starts");

		Runnable r = () -> {
			System.out.println("Thread1 starts (" + Thread.currentThread() + ")");
			try {
				for (int i = 0; i <= 5; i++) {
					System.out.println("i = " + i);
					Thread.sleep(1000);
				}
				System.out.println("Thread1 ends");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread thread1 = new Thread(r);
		thread1.start();
		System.out.println("Main Thread ends");

	}
}
