package concurrency.producer.consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferApp3 {

	public static void main(String[] args) throws InterruptedException {
		// create new thread pool with two threads
		ExecutorService executorService = Executors.newCachedThreadPool();

		// create SynchronizedBuffer to store ints
		Buffer sharedLocation = new SynchronizedBuffer();

		System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation", "Buffer", "Occupied",
				"---------", "------\t\t--------");

		// execute the Producer and Consumer tasks
		executorService.execute(new Producer(sharedLocation));
		executorService.execute(new Consumer(sharedLocation));

		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);

	}

}
