import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static AtomicLong count = new AtomicLong();

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість потоків: ");
        final int n = sc.nextInt();
        final long totalIterations = 1_000_000_000;

        int iterations = (int) (totalIterations / n);

        Thread[] threads = new Thread[n];

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new ParallelMonteCarloPi(iterations));
            thread.start();
            threads[i] = thread;
        }

        for (Thread thread : threads) {
            thread.join();
        }
        long end = System.currentTimeMillis();

        System.out.printf("PI is %.5f\n", (double) (count.get()) / totalIterations * 4);
        System.out.printf("Threads: %d\n", n);
        System.out.printf("Iterations: %d\n", totalIterations);
        System.out.printf("Time: %d ms.", end - start);
    }
}