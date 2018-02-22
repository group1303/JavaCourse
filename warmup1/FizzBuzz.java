package warmup1;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(assertEquals("Hello", "Hello"));
        System.out.println(assertEquals("Hello", " Hello"));
        System.out.println(assertEquals("Fizz", " Fizz"));

        fizzBuzz(3);
    }

    private static String fizzBuzz(int i) {
        return "Fizz";
    }

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
