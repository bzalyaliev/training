package concurrency.synchronizedtest;

public class Test {
    private int counter = 0;

    public synchronized void calculation() {
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }

    public void doWork() {
        var thread1 = new Thread(this::calculation);
        var thread2 = new Thread(this::calculation);

        try {
            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            System.out.println(counter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        var test = new Test();
        test.doWork();
    }
}
