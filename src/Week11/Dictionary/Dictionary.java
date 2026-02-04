package Week11.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> words;

    public Dictionary() {
        words = new HashMap<>();
    }

    public void addWord(String word, String translation) {
        if (words.get(word) == null)
            words.put(word, translation);
        else
            System.out.println("Word is already in dictionary");
    }

    public String translate(String word) {
        if (words.get(word) == null)
            return "Woord niet gevonden";
        return words.get(word);
    }
    public int numberOfWords(){
        return words.size();
    }

}
