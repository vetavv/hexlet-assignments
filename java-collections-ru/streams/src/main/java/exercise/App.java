package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");
        if (emails != null) {
            return (int) emails.stream()
                    .filter(email -> email.contains("@"))
                    .map(email -> email.split("@")[1])
                    .filter(email -> freeDomains.contains(email))
                    .count();
        }
        return 0;
    }
}
// END
