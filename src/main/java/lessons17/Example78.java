package lessons17;

import java.util.Scanner;

public class Example78 {
    public static void main(String[] args) {
        int choose = new Scanner(System.in).nextInt();

        if (choose == 1) {
            System.out.println("1");
        } else if (choose == 2) {
            System.out.println("2");
        } else if (choose == 3) {
            System.out.println("3");
        }else if (choose == 4) {
            System.out.println("4");
        } else {
            System.out.println("No that number");
        }

        switch (choose){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;
            case 4:
            case 5:
                System.out.println("4 or 5");
            default:
                System.out.println("Not here a number");
                break;


        }



    }
}
