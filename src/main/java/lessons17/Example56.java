package lessons17;

import org.example.A;

public class Example56 {
    public static void main(String[] args) {
        T t = new T() {
            @Override
            public void method() {
                int count = 15;
                System.out.println("Anonim class");
                System.out.println(count);
            }
        };
        System.out.println(t.getClass().getName());
        t.method();
        System.out.println(t.f);


    }
}
