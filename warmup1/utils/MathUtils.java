package warmup1.utils;

public class MathUtils {

    public static int mod(int divisible, int divider) {
        if (divider == 0)
            throw new ArithmeticException("Divider can't be 0");
        if (divisible < divider)
            return 0;
        return divisible - divisible / divider * divider;
    }
}
