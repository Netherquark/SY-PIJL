/*
 * Name: Your Name
 * PRN: Your PRN
 * Batch: Your Batch
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java Threads Demonstration ===");

        // Thread using Runnable interface (recommended)
        NumberPrinterRunnable oddPrinter = new NumberPrinterRunnable(1, 2, 10, "OddPrinter");
        NumberPrinterRunnable evenPrinter = new NumberPrinterRunnable(2, 2, 10, "EvenPrinter");

        Thread oddThread = new Thread(oddPrinter, "OddThread");
        Thread evenThread = new Thread(evenPrinter, "EvenThread");

        // Thread using Thread subclass
        MessagePrinterThread messageThread = new MessagePrinterThread("Hello from Thread subclass!", 5);

        // Start threads
        oddThread.start();
        evenThread.start();
        messageThread.start();

        // Wait for threads to finish
        try {
            oddThread.join();
            evenThread.join();
            messageThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println("=== All threads have finished execution ===");
    }
}

