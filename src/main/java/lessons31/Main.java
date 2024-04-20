package lessons31;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // TODO:
        Date date = new Date();
        System.out.println(date);
        Date burthday = new Date(91,10,10);
        System.out.println(burthday);
        Date current = new Date(105, 5, 4, 12, 15, 0);
        System.out.println(current.getYear());
        System.out.println(current.getMonth());
        System.out.println(current.getDate());
        System.out.println(current.getDay());
        System.out.println(current.getTime() );
        System.out.println("Izm");
        System.out.println("add new branch dev");

    }
}
