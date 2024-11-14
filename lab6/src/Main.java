import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();
        Scanner scanner = new Scanner(System.in);

        translator.addWord("hello", "привіт");
        translator.addWord("world", "світ");

        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Додати слово до словника");
            System.out.println("2. Перекласти фразу");
            System.out.println("3. Вийти");
            System.out.print("Оберіть дію: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введіть англійське слово: ");
                    String englishWord = scanner.nextLine();
                    System.out.print("Введіть український переклад: ");
                    String ukrainianWord = scanner.nextLine();
                    translator.addWord(englishWord, ukrainianWord);
                    System.out.println("Слово додано до словника.");
                    break;

                case 2:
                    System.out.print("Введіть фразу англійською мовою для перекладу: ");
                    String phrase = scanner.nextLine();
                    String translatedPhrase = translator.translatePhrase(phrase);
                    System.out.println("Переклад фрази українською мовою: " + translatedPhrase);
                    break;

                case 3:
                    System.out.println("Завершення програми.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
                    break;
            }
        }
    }
}