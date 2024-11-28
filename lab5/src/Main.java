import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static String findLongestLine(String path) {
        String longest = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int max = 0;

            String line;
            while ((line = br.readLine()) != null) {
                int len = line.split("\\s+").length;
                if (len > max) {
                    max = len;
                    longest = line;
                }
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        return longest;
    }

    public static Map<String, Integer> CountHTMLTags(String url) throws IOException {
        String htmlCode = new String(new URL(url).openStream().readAllBytes());
        Pattern pattern = Pattern.compile("<(//w+)");
        Matcher matcher = pattern.matcher(htmlCode);

        Map<String, Integer> map = new HashMap<>();
        while (matcher.find()) {
            String tag = matcher.group(1);
            map.put(tag, map.getOrDefault(tag, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String longestLine = findLongestLine("files/test.txt");
        System.out.println("Найдовший рядок з файлу: " + longestLine + "\n");

        System.out.print("Введіть текст для шифрування: ");
        String text = sc.nextLine();
        System.out.print("Введіть ключ шифрування (символ): ");
        char key = sc.next().charAt(0);
        sc.close();

        try (EncodeStream es = new EncodeStream(new FileOutputStream("files/encoded.txt"), key)) {
            es.write(text.getBytes());
        }

        try (DecodeStream ds = new DecodeStream(new FileInputStream("files/encoded.txt"), key)) {
            System.out.print("Розшифрований текст: ");
            int b = ds.read();
            while (b != -1) {
                System.out.print((char) b);
                b = ds.read();
            }
            System.out.println("\n");
        }

        Map<String, Integer> tags = CountHTMLTags("https://www.google.com/");
        System.out.println("Теги в лексикографічному порядку: ");
        tags.keySet().stream().sorted().forEach(tag -> {
            System.out.println(tag + ": " + tags.get(tag));
        });

        System.out.println("Теги за частотою появи: ");
        tags.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
        });
    }
}