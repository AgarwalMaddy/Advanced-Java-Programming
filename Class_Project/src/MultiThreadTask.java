
public class MultiThreadTask {

    public static void main(String[] args) {
        // create a task to be performed
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        long startTime = System.currentTimeMillis();
        performTask(data);
        long endTime = System.currentTimeMillis();
        System.out.println("Single-threaded task completed in " + (endTime - startTime) + " milliseconds");
        
        // create two threads to perform the same task in parallel
        Thread thread1 = new Thread(() -> performTask(data, 0, data.length / 2));
        Thread thread2 = new Thread(() -> performTask(data, data.length / 2, data.length));

        startTime = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Multi-threaded task completed in " + (endTime - startTime) + " milliseconds");
    }
    
    private static void performTask(int[] data) {
        for (int i = 0; i < data.length; i++) {
            // simulate a time-consuming task
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " processing element " + data[i]);
        }
    }
    
    private static void performTask(int[] data, int start, int end) {
        for (int i = start; i < end; i++) {
            // simulate a time-consuming task
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " processing element " + data[i]);
        }
    }
}
