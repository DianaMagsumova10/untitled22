package org.example;

import java.util.Arrays;

public class Example96 {
    public static void main(String[] args) {
        Family family = Family.DINAR;
//        System.out.println(family);

        Family[] list =  Family.values();
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }

        System.out.println(Arrays.toString(list));


        System.out.println(family == Family.DINAR);
        System.out.println(family.equals(Family.DINAR));

        System.out.println(Family.ARINA.ordinal());
        System.out.println(Family.DIANA.ordinal());
        System.out.println(Family.DINAR.ordinal());

    }
}
