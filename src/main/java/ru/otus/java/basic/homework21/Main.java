package ru.otus.java.basic.homework21;

public class Main {
    private static double[] array = new double[100_000_000];
    private static int threads = 4;

    public static void main(String[] args) throws InterruptedException {
        long t = System.currentTimeMillis();
        fill();
        System.out.println("Single Thread:" + (System.currentTimeMillis() - t));
        t = System.currentTimeMillis();
        fastFill();
        System.out.println("Multiple Threads:" + (System.currentTimeMillis() - t));
    }

    private static void fill() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    private static void fastFill() throws InterruptedException {
        Thread[] threadArr = new Thread[threads];
        for (int i = 0; i < threads; i++) {
            int step = i;
            threadArr[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = step; j < array.length; j = j + threads) {
                        array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                    }
                }
            });
            threadArr[i].start();
        }

        for (int i = 0; i < threads; i++) {
            threadArr[i].join();
        }
    }
}
