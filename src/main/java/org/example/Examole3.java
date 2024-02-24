package org.example;

import java.util.HashMap;
import java.util.Map;

public class Examole3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Серега", 21);
        hashMap.put("Николай", 22);
        hashMap.put("Иван Петрович", 48);
        hashMap.put("Анюта", null);


        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("*".repeat(50));

        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }

        System.out.println("*".repeat(50));
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }
        System.out.println("*".repeat(50));

        for (String key: hashMap.keySet())
        {
            Integer value = hashMap.get(key);
            System.out.println(key + " --> " + value);
        }
        System.out.println("*".repeat(50));

        for (String s : hashMap.keySet()) {
            Integer value = hashMap.get(s);
            System.out.println(s +" " + value);
        }

    }
}
