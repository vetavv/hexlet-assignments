package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testTake() {
        // BEGIN
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(2);
        input.add(4);
        input.add(5);
        expected.add(1);
        expected.add(2);
        expected.add(2);
        Assertions.assertEquals(App.take(input, 3), expected);
        // END
    }
}
