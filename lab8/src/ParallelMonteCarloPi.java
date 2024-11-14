import java.util.Random;

public class ParallelMonteCarloPi implements Runnable {
    private final int iterations;

    public ParallelMonteCarloPi(int iterations) {
        this.iterations = iterations;
    }

    @Override
    public void run() {
        Random r = new Random();
        for (int i = 0; i < iterations; i++) {
            double x = r.nextDouble();
            double y = r.nextDouble();
            if (x * x + y * y <= 1) {
                Main.count.getAndAdd(1);
            }
        }

    }
}
