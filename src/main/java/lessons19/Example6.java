package lessons19;

public class Example6 {
    public static void main(String[] args)  {
        System.out.println(div(10,0));
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    }

    public static int  div(int division, int divisor)  {
        if(divisor == 0){
            throw new DivisionException("Bla bla");
        }

        return division/divisor;
    }
}
