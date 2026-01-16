package org.module12Homework.topic1;

public class PrintTime extends Thread {

    private int time = 0;

    @Override
    public void run() {

        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
                time++;
                System.out.println(time);

            } catch (InterruptedException e) {
                interrupt();
            }
        }
    }
}
