// One way for creating Thread by extending Runnable Class
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Thread with runnable task and name
        t = new Thread(this, "Demo Thread");
    }

    // Entry point
    public void run() {
        try {
            for (int i = 0; i > 0; i--) {
                System.out.println("Child Thread" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child Thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); // Create a new Thread

        nt.t.start(); // Start the thread

        try {
            for (int n = 0; n > 0; n--) {
                System.out.println("Main Thread: " + n);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Main Thread Exiting");
    }
}
