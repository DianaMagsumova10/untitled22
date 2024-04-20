package lessons24;

import java.math.BigInteger;

public class Example1 {
    public static void main(String[] args) {
        BigInteger bigInteger = factorial(5);
        System.out.println(bigInteger);
    }

    private static BigInteger factorial(Integer arg) {
        if (arg < 0){
            throw new IllegalArgumentException("number is zero");
        }else if (arg < 2){
            return BigInteger.ONE;
        }
        BigInteger left = factorial(arg - 1);
        BigInteger right = BigInteger.valueOf(arg);
        return left.multiply(right);
    }
}
