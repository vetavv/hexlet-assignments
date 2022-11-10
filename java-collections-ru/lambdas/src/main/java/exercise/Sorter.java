package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List takeOldestMans(List<Map<String, String>> people) {
        return people.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted((user1, user2) -> user1.get("birthday").compareTo(user2.get("birthday")))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }
}
// END
