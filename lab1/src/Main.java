import java.util.Scanner;

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
        int counter = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                int temp = i, reversed = 0;
                while (temp > 0) {
                    reversed = reversed * 10 + temp % 10;
                    temp /= 10;
                }
                if (isPrime(reversed)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static boolean isPrime(int n) {
        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}