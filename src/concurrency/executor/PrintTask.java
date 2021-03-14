package concurrency.executor;

import java.security.SecureRandom;

public class PrintTask implements Runnable {

	private static final SecureRandom sr = new SecureRandom();
	private final int sleepTime;
	private final String taskName;

	public PrintTask(String taskName) {
		sleepTime = sr.nextInt(5000);
		this.taskName = taskName;
	}

	@Override
	public void run() {
		try {
			System.out.printf("%s is going to sleep for %d milliseconds\n", taskName, sleepTime);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		System.out.printf("%s done sleeping\n", taskName);
	}

}
