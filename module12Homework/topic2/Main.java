package org.module12Homework.topic2;

public class Main {
    public static void main(String[] args) {

        NumberProcessor np = new NumberProcessor(15);

        new Thread(() -> {
            try { np.fizz(); } catch (InterruptedException ignored) {}
        }).start();

        new Thread(() -> {
            try { np.buzz(); } catch (InterruptedException ignored) {}
        }).start();

        new Thread(() -> {
            try { np.fizzbuzz(); } catch (InterruptedException ignored) {}
        }).start();

        new Thread(() -> {
            try { np.number(); } catch (InterruptedException ignored) {}
        }).start();
    }
}
