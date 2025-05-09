/**
 * Prints a message multiple times in a separate thread.
 * Demonstrates extending Thread for thread logic.
 */
public class MessagePrinterThread extends Thread {
    private final String message;
    private final int repeatCount;

    public MessagePrinterThread(String message, int repeatCount) {
        super("MessagePrinterThread");
        this.message = message;
        this.repeatCount = repeatCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= repeatCount; i++) {
            System.out.printf("[%s] %s (%d/%d)\n", getName(), message, i, repeatCount);
            try {
                Thread.sleep(150); // Sleep for 150ms to simulate work
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println(getName() + " finished.");
    }
}

