package org.module12Homework.topic1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintTime printTime = new PrintTime();

        printTime.start();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(5000);
            System.out.println("Минуло 5 секунд");
        }
        printTime.interrupt();
    }
}
