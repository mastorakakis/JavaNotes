package concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskExecutorApp {

	public static void main(String[] args) {

		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");
		
		System.out.println("Starting executor");
		
		// create ExecutorService to manage threads
		ExecutorService es = Executors.newCachedThreadPool();
		
		// start the three PrintTasks
		es.execute(task1);
		es.execute(task2);
		es.execute(task3);
		es.execute(() -> System.out.println("Executing Lambda Task"));
		
		// shut down ExecutorService--it decides when to shut down threads
		es.shutdown();
		
		System.out.printf("Tasks started, main ends.\n\n");

	}

}
