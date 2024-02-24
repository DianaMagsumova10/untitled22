package org.example;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
//        List<A> as = new ArrayList<>();
//        as.add(new A(5));
//        as.add(new A(45));
//        as.add(new A(77));
//        as.add(new A(88));
//        as.add(new A(36));
//        as.add(new A(54));
//        as.add(new A(59));
//        System.out.println(as.get(5));
//        System.out.println(as.get(1));

        List<Pair<String, Integer>> keyAndValue = new ArrayList<>();
        keyAndValue.add(new Pair<>("One", 1));
//        keyAndValue.add(new Pair<>("Two", 5));
        keyAndValue.add(new Pair<>("Two", 2));
        keyAndValue.add(new Pair<>("Three", 3));


        for (Pair<String, Integer> integerPair : keyAndValue) {
            if(integerPair.getKey().equals("Two")){
                System.out.println("Find: " + integerPair.getValue());
                break;
            }
        }



    }

}
