package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        Map<B, Integer> map = new HashMap<>();
        B b = new B(1);
        B b2 = new B(2);
        B b3 = new B(3);

        map.put(b, 1);
        map.put(b2, 2);
        map.put(b3, 3);
        System.out.println(map);

        Set<Map.Entry<B, Integer>> entries = map.entrySet();
        for (Map.Entry<B, Integer> entry : entries) {
            System.out.println(entry);
        }


    }
}
class B{
    private final int value;

    public B(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return value == b.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "B{" +
                "value=" + value +
                '}';
    }
}