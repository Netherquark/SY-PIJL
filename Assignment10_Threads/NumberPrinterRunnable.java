/**
 * Prints a sequence of numbers in a separate thread.
 * Demonstrates implementing Runnable for thread logic.
 */
public class NumberPrinterRunnable implements Runnable {
    private final int startNumber;
    private final int increment;
    private final int count;
    private final String printerName;

    public NumberPrinterRunnable(int startNumber, int increment, int count, String printerName) {
        this.startNumber = startNumber;
        this.increment = increment;
        this.count = count;
        this.printerName = printerName;
    }

    @Override
    public void run() {
        int current = startNumber;
        for (int i = 0; i < count; i++) {
            System.out.printf("[%s] %d\n", printerName, current);
            current += increment;
            try {
                Thread.sleep(200); // Sleep for 200ms to simulate work
            } catch (InterruptedException e) {
                System.out.println(printerName + " interrupted.");
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println(printerName + " finished.");
    }
}

