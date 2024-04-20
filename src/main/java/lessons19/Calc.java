package lessons19;

public class Calc {
    public static void main(String[] args) {

        try {
            int x = division(null, "1");
            System.out.println("Все сработало корректноб результат:" + x);
            return;
        } catch (IllegalArgumentException e){
            System.out.println("Арифметическая ошибка ");
        }


    }

    private static int division(String i, String i1) {
        if (i == null || i1 == null) {
            throw new IllegalArgumentException("Vot");
        }

        int a = Integer.parseInt(i);
        int b = Integer.parseInt(i1);
        int result = a / b;
        return result;
    }
}
