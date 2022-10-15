import org.example.Algorithms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AlgorithmsTest {
    private final Algorithms algorithms = new Algorithms();

    @Test
    void checkFactorialForSmallNumbers() {
        assertAll(
                () -> assertEquals(1, algorithms.factorial(0)),
                () -> assertEquals(1, algorithms.factorial(1)),
                () -> assertEquals(2, algorithms.factorial(2)),
                () -> assertEquals(6, algorithms.factorial(3)),
                () -> assertEquals(24, algorithms.factorial(4)),
                () -> assertEquals(120, algorithms.factorial(5))
        );
    }
}

