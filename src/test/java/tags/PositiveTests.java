package tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("positive")
public class PositiveTests {

    @Test
    void test1() {
        assertTrue(true);
    }

    @Test
    void test2() {
        assertTrue(true);
    }

    @Test
    @Tag("smoke")
    void test3() {
        assertTrue(true);
    }

    @Test
    @Tag("smoke")
    void test4() {
        assertTrue(true);
    }

    @Test
    @Tag("prod")
    void test5() {
        assertTrue(true);
    }
}
