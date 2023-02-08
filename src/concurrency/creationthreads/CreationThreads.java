package concurrency.creationthreads;

public class CreationThreads {
    public static void main(String[] args) {
        var myThread1 = new MyThread();
        var myThread2 = new Thread(new Runner());
        myThread1.start();
        myThread2.start();
    }
}


