package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> dict1, Map<String, Object> dict2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, Object> item : dict1.entrySet()) {
            String key = item.getKey();
            if (dict2.containsKey(key)) {
                if (dict2.get(key).equals(item.getValue())) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            } else {
                result.put(key, "deleted");
            }
        }
        for (Map.Entry<String, Object> item2 : dict2.entrySet()) {
            String key = item2.getKey();
            if (!dict1.containsKey(key)) {
                result.put(key, "added");
            }
        }
        return result;
    }
}
//END
