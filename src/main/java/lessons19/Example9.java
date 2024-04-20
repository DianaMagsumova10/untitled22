package lessons19;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        ResourceA resourceA = null;
        try {
             resourceA = new ResourceA();
            resourceA.run(console.nextInt());
        } catch (RuntimeException e){
            System.out.println("RuntimeException exception");
        }finally {
            try {
                resourceA.close();
            } catch (Exception e){
                System.out.println(".....23");
            }
        }

        try(ResourceA resourceA2 = new ResourceA()) {
            resourceA2.run(console.nextInt());

        } catch (Exception e) {
            System.out.println("catch you");
        }


    }
}
