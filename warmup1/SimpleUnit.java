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
        final boolean equals = actual.equals(expected);
        if (!equals) {
            System.err.println("Test failed: expected " + expected + ", but actual " + actual);
        }
        return equals;
    }
}
