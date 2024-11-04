package akash;

class SleepThread extends Thread {
    @Override
    public void run() {
        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Print exception if sleep is interrupted
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

public class PrintNumbersWithSleep {
    public static void main(String[] args) {
        // Create an instance of the SleepThread
        SleepThread thread = new SleepThread();

        // Start the thread, which will call the run() method
        thread.start();
    }
}

