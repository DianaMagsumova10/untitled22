package lessons19;

public class Example8 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        method2();
    }
    public static void method2(){
        method3();
    }
    public static void method3(){
        System.out.println("Method 3 ");
        throw  new RuntimeException();
    }
}
