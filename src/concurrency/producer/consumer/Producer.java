package concurrency.producer.consumer;

import java.security.SecureRandom;

//Producer with a run method that inserts the values 1 to 10 in buffer.
public class Producer implements Runnable {

	private static final SecureRandom generator = new SecureRandom();
	private final Buffer sharedLocation; // reference to shared object

	public Producer(Buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}

	// store values from 1 to 10 in sharedLocation
	@Override
	public void run() {
		int sum = 0;
		for (int count = 1; count <= 10; count++) {

			try { // sleep 0 to 1 second, then place value in Buffer
				Thread.sleep(generator.nextInt(1000)); // random sleep
				sharedLocation.blockingPut(count); // set value in buffer
				sum += count; // increment sum of values
//				System.out.printf("\t%2d%n", sum);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.printf("Producer done producing%nTerminating Producer\n");
	}

}
