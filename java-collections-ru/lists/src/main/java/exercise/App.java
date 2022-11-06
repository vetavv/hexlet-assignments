package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String strSimbols, String strWord) {
        var arraySimbols = strSimbols.split("");
        var arrayWord = strWord.split("");
        List<String> listSimbols = new ArrayList<>();
        List<String> listWord = new ArrayList<>();
        for (String item : arrayWord) {
            listWord.add(item.toLowerCase());
        }
        for (var item : arraySimbols) {
            listSimbols.add(item.toLowerCase());
        }
        for (var item : listWord) {
            if (listSimbols.contains(item)) {
                listSimbols.remove(item);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
