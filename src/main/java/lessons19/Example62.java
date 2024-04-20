package lessons19;

public class Example62 {
    public static void main(String[] args) throws Exception {
//        throw new Exception();
//        Error error = new Error();

        methodExc();

    }

    private static void methodExc() {
        try {
            throw new Exception("Error massage ");
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
