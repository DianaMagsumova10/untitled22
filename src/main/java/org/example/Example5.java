package org.example;

import java.util.ArrayList;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            integers.add(i);
        }
        System.out.println(integers);

        for (int i = 20; i <= 25 ; i++) {
            integers.remove(i);
        }
        System.out.println(integers);

    }


}
