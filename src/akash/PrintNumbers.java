package akash;

class NumberThread extends Thread {
    @Override
    public void run() {
        // Loop to print numbers from 0 to 4
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }
    }
}

public class PrintNumbers {
    public static void main(String[] args) {
        // Create an instance of the NumberThread
        NumberThread thread = new NumberThread();

        // Start the thread, which will call the run() method
        thread.start();
    }
}
