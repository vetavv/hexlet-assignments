package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> findThis) {
        List<Map<String, String>> result = new ArrayList<>();
        boolean bookIsFind = false;

        for (var book : books) {
            bookIsFind = true;
            for (var key : findThis.keySet()) {
                String bookValue = book.getOrDefault(key, "");
                if (!bookValue.equals(findThis.get(key))) {
                    bookIsFind = false;
                }
            }
            if (bookIsFind) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
