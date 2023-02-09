package concurrency.producerconsumertest;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Produce-consumer pattern. First thread will put random numbers to the queue, second thread will take from queue. Infinity time.
public class Test {

    private static final BlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);

    public static void produce() {
        Random random = new Random();
        while (true) {
            try {
                arrayBlockingQueue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void consumer() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(arrayBlockingQueue.take());
                System.out.println("queue size: " + arrayBlockingQueue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread producerThread = new Thread(Test::produce);
        Thread consumerThread = new Thread(Test::consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
