import java.util.HashMap;
import java.util.Map;

public class Translator {
    private final Map<String, String> dictionary;

    public Translator() {
        dictionary = new HashMap<>();
    }

    public void addWord(String english, String ukrainian) {
        dictionary.put(english.toLowerCase(), ukrainian.toLowerCase());
    }

    public String translatePhrase(String phrase) {
        String[] words = phrase.toLowerCase().split(" ");
        StringBuilder translated = new StringBuilder();

        for (String word : words) {
            if (!dictionary.containsKey(word)) {
                throw new IllegalArgumentException("У словнику немає перекладу для " + word);
            } else {
                translated.append(dictionary.get(word)).append(" ");
            }
        }

        return translated.toString().trim();
    }
}
