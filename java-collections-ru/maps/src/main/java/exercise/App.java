package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {

        var words = sentence.strip().split(" ");
        List<String> listWords = new ArrayList<>(Arrays.asList(words));
        Map<String, Integer> countWords = new HashMap<>();

        if (sentence.length() == 0) {
            return countWords;
        }
        for (var word : listWords) {
            int count = 0;
            for (var item : words) {
                if (word.equals(item)) {
                    count += 1;
                }
            }
            countWords.put(word, count);
        }
        return countWords;
    }

    public static String toString(Map<String, Integer> lengthWords) {
        if (lengthWords.isEmpty()) {
            return "{}";
        }
        var strResult = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> word: lengthWords.entrySet()) {
            strResult.append("  " + word.getKey() + ": " + word.getValue() + "\n");
        }
        strResult.append("}");
        return strResult.toString();
    }
}
//END
