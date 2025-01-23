
public class VolatileExample {

    // Volatile variable, ensuring visibility across threads
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        // Thread 1: Sets the flag to true after 2 seconds
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;  // Change flag value
            System.out.println("Thread 1 has set flag to true");
        });

        // Thread 2: Waits for flag to become true
        Thread t2 = new Thread(() -> {
            while (!flag) {  // Keeps checking flag
                
            }
            System.out.println("Thread 2 detected flag is true");
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}

