import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть число N (до 1000): ");
        final int N = input.nextInt();
        input.close();

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
                        System.out.println(i + " " + reversed);
                    }
                }
        }

        System.out.printf("Кількість надпростих чисел від 1 до N: %d", counter);
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