import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        do {
            System.out.print("Введіть натуральне число N (до 1000): ");
            N = input.nextInt();
        } while (N < 1 || N > 1000);
        input.close();

        int result = getNumber(N);
        System.out.printf("Кількість надпростих чисел менших за %d: %d", N, result);
    }

    public static int getNumber(int N) {
        IntPredicate isPrime = n -> {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        };

        return (int) IntStream.rangeClosed(2, N)
                .filter(isPrime)
                .filter(i -> {
                    int reversed = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
                    return isPrime.test(reversed);
                })
                .count();
    }
}