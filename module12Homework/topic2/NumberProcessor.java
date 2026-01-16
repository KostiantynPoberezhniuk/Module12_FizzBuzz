package org.module12Homework.topic2;

public class NumberProcessor {

    private int n = 1;
    private final int max;

    public NumberProcessor(int max) {
        this.max = max;
    }

    private void print(String value) {
        if (n > 1) {
            System.out.print(", ");
        }
        System.out.print(value);
    }

    public synchronized void fizz() throws InterruptedException {
        while (n <= max) {
            while (n <= max && !(n % 3 == 0 && n % 5 != 0)) {
                wait();
            }
            if (n > max) return;

            print("fizz");
            n++;
            notifyAll();
        }
    }

    public synchronized void buzz() throws InterruptedException {
        while (n <= max) {
            while (n <= max && !(n % 5 == 0 && n % 3 != 0)) {
                wait();
            }
            if (n > max) return;

            print("buzz");
            n++;
            notifyAll();
        }
    }

    public synchronized void fizzbuzz() throws InterruptedException {
        while (n <= max) {
            while (n <= max && !(n % 3 == 0 && n % 5 == 0)) {
                wait();
            }
            if (n > max) return;

            print("fizzbuzz");
            n++;
            notifyAll();
        }
    }

    public synchronized void number() throws InterruptedException {
        while (n <= max) {
            while (n <= max && (n % 3 == 0 || n % 5 == 0)) {
                wait();
            }
            if (n > max) return;

            print(String.valueOf(n));
            n++;
            notifyAll();
        }
    }
}
