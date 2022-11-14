package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;



// BEGIN
class App {
    public static String getForwardedVariables(String content) {
        List<String> text = new ArrayList<>();
        var content1 = content.split("\n");
        for (var item : content1) {
            text.add(item);
        }
        return  text.stream()
                .filter(str -> str.startsWith("environment"))
                .map(str -> str.replace("environment=", ""))
                .map(str -> str.replace("\"", ""))
                .map(str -> str.split(","))
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
