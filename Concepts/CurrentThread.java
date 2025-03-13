public class CurrentThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread" + t);

        // Change the name of the thread
        t.setName("My thread");

        System.out.println("After changing the name: " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }

}
