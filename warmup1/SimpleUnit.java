package warmup1;

public class SimpleUnit {
    public static boolean assertEquals(String actual, String expected) {
        final boolean equals = actual.equals(expected);
        if (!equals) {
            System.err.println("Test failed: expected " + expected + ", but actual " + actual);
        }
        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected) {
        final boolean notEquals = !actual.equals(expected);
        if (!notEquals) {
            System.err.println("Test failed: not expected " + expected + ", but actual " + actual);
        }
        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected) {
        final boolean equals = actual == expected;
        if (!equals) {
            System.err.println("Test failed: expected " + expected + ", but actual " + actual);
        }
        return equals;
    }

    public static boolean assertNotEquals(int actual, int expected) {
        final boolean notEquals = actual != expected;
        if (!notEquals) {
            System.err.println("Test failed: not expected " + expected + ", but actual " + actual);
        }
        return notEquals;
    }
}
