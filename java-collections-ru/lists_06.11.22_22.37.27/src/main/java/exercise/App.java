package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String strSimbols, String strWord) {
        var wordLength = strWord.length();
        var arraySimbols = strSimbols.split("");
        List<String> lettersSet = new ArrayList<>(Arrays.asList(arraySimbols));

        for (int i = 0; i < wordLength; i++) {
            var currentLetter = strWord.substring(i, i + 1).toLowerCase();
            if (lettersSet.contains(currentLetter)) {
                lettersSet.remove(currentLetter);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
