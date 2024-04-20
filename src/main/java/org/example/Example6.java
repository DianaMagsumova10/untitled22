package org.example;

import javax.swing.*;
import java.time.temporal.WeekFields;

import static org.example.Days.FRIDAY;
import static org.example.Days.MONDAY;
import static org.example.Days.THERSDAY;

public class Example6 {
    public static void main(String[] args) {
        System.out.println(FRIDAY);
        System.out.println(Days.TUESDAY.name());
        System.out.println(Days.MONDAY.ordinal());
        System.out.println(Days.valueOf("Friday".toUpperCase()));
        System.out.println(Days.TUESDAY);
        System.out.println(Days.MONDAY.getName());
        System.out.println(Days.MONDAY);
        System.out.println(THERSDAY);
        System.out.println("*".repeat(50));
        System.out.println(THERSDAY.getClass().getName());
        System.out.println(MONDAY.getClass().getName());
        System.out.println("*".repeat(50));
        for (Days value : Days.values()) {
            System.out.println(value);
        }


    }
}
enum Days{
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WENDSDAY("Среда"),
    THERSDAY(){
        @Override
        public String toString() {
            return "Days{ " + this.name() + ": " +
                    this.ordinal()  +  " }";

        };
    },
    FRIDAY;

    public final String name;

  private Days() {
      this.name = null;
    }
    private Days(String name){
      this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Days{ " + this.name() + ": " +  this.ordinal() + ", "  + " name: " + name + " }";
    }
}
