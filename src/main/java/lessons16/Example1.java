package lessons16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(queue);
        System.out.println("*-".repeat(50));
        queue.add(78);
        System.out.println(queue);

        System.out.println("*-".repeat(50));
        queue.offer(45);
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        System.out.println("*-".repeat(50));

        queue.poll();
        System.out.println(queue);
        System.out.println("*-".repeat(50));

        queue.element();
        System.out.println(queue);
        System.out.println("*-".repeat(50));

        queue.peek();
        System.out.println(queue);
        System.out.println("*-".repeat(50));







    }
}
