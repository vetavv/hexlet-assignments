package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        var words = sentence.strip().split(" ");
        Map countWords = new HashMap();

        if (sentence.length() == 0) {
            return countWords;
        }

        for (var word : words) {
            int currentCount = (int)countWords.getOrDefault(word, 0);
            currentCount += 1;
            countWords.put(word, currentCount);
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
