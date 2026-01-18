package org.module12Homework.topic2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        NumberProcessor np = new NumberProcessor(15);

        Thread t1 = new Thread(() -> {
            try {
                np.fizz();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                np.buzz();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });


        Thread t3 = new Thread(() -> {
            try {
                np.fizzbuzz();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t4 = new Thread(() -> {
            try {
                np.number();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}
