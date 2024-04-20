package lessons22;

import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(45);
        integers.push(56);
        integers.push(78);
        integers.push(96);
        integers.push(4235564);
        integers.push(63);
        integers.push(98);
        integers.push(12);
        integers.push(132);
        System.out.println(integers.size());
        System.out.println(integers.search(45));
        System.out.println(integers.isEmpty());
        System.out.println("*".repeat(45));
        System.out.println(integers.peek());
        System.out.println(integers.size());
        System.out.println(integers.pop());
        System.out.println(integers.size());
    }
}
