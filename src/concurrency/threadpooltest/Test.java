package concurrency.threadpooltest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Run 2 threads to do 5 works. With ExecutorService
public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Worker(i));
        }
        executorService.shutdown();
        try {
            System.out.println(executorService.awaitTermination(1, TimeUnit.DAYS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Worker implements Runnable {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Worker " + id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
