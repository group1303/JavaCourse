package warmup1;

public class FizzBazzTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals("Hello", "Hello"));
        System.out.println(SimpleUnit.assertEquals("Hello", " Hello"));
        System.out.println(SimpleUnit.assertEquals("Fizz", " Fizz"));

        FizzBuzz.fizzBuzz(3);
    }
}
