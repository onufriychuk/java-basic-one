package ru.otus.java.basic.homework29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static Object monitor = new Object();
    private static char lastPrinted = 'C';
    public Main() {

    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(() -> {
            for (int i = 0; i < 5; i++) {
                print('A', 'C');
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 5; i++) {
                print('B', 'A');
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 5; i++) {
                print('C', 'B');
            }
        });
        executorService.shutdown();
    }

    public static void print(char currentSymbol, char previousSymbol) {
        synchronized (monitor) {
            try {
                while (lastPrinted != previousSymbol) {
                    monitor.wait();
                }
                System.out.println(currentSymbol);
                lastPrinted = currentSymbol;
                monitor.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
