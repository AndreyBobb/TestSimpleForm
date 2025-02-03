package simpletests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SkippedTests {
    @Disabled("Reason")
    @Test
    void test1() {
        assertTrue(true);
    }

    @Disabled("Reason")
    @Test
    void test2() {
        assertTrue(true);
    }

    @Disabled("Reason")
    @Test
    void test3() {
        assertTrue(true);

    }
}
