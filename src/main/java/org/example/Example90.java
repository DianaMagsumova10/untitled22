package org.example;

public class Example90 {
    public static void main(String[] args) {
        String x = Family.DINAR.toString();
        System.out.println(x);
        System.out.println(Family.valueOf(x));

        int count = 2;
        int value = switch (count) {
            case 1 -> {
                //некоторые вычислительные операции...
                yield  12;
            }
            case 2 -> {
                //некоторые вычислительные операции...
                yield  32;
            }
            case 3 -> {
                //некоторые вычислительные операции...
                yield  52;
            }
            default -> {
                //некоторые вычислительные операции...
                yield  0;
            }
        };

    }
}
