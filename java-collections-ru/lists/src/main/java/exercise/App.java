package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String characterString, String word) {
        var wordLength = word.length();
        var charactersArray = characterString.split("");
        List<String> characters = new ArrayList<>(Arrays.asList(charactersArray));

        for (int i = 0; i < wordLength; i++) {
            var checkingLetter = word.substring(i, i + 1).toLowerCase();
            if (characters.contains(checkingLetter)) {
                characters.remove(checkingLetter);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
