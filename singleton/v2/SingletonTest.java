package singleton.v2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ChocolateBoiler {
    private static ChocolateBoiler boiler;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (boiler == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            boiler = new ChocolateBoiler();
        }
        return boiler;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println(Thread.currentThread().getName() + ", fill the boiler");
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println(Thread.currentThread().getName() + ", drain the boiler");
            empty = true;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println(Thread.currentThread().getName() + ", boil the boiler");
            boiled = true;
        }
    }
}

class ChocolateTask implements Runnable {
    private ChocolateBoiler boiler;

    @Override
    public void run() {
        boiler = ChocolateBoiler.getInstance();
        System.out.println(boiler);
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new ChocolateTask());
        }
        exec.shutdown();
    }
}
