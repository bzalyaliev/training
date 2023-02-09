package concurrency.synchronizedtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Need to write to 2 Lists by 2 threads. Each thread - to his list.
public class TestTwo {

    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker {
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    Random random = new Random();
    Thread thread1 = new Thread(this::work);
    Thread thread2 = new Thread(this::work);

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToListOne();
            addToListTwo();
        }
    }

    public void addToListOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToListTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void main() {
        var before = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        var after = System.currentTimeMillis();
        System.out.println("It worked " + (after - before) + " ms");
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
