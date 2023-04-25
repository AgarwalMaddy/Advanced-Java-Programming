import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecutorExample {
    
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Create two instances of a task that implements Runnable
        Runnable task1 = new Task(" of Locking");
        Runnable task2 = new Task(" of Checking");
        
        System.out.println("Starting Executor");
        // Submit the tasks to the executor to run in parallel
        executor.submit(task1);
        executor.submit(task2);
        
        // Shutdown the executor after all tasks have completed
        executor.shutdown();
    }
}

class Task implements Runnable { 
    private String name;
    public Task(String name) {
        this.name = name;
    } 
    public void run() {
    	System.out.println("Task " + name + " is running on thread " + Thread.currentThread().getName());
    }
}
