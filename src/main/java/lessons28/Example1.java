package lessons28;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        byte[] buf = {65, 66, 67, 68, 69};
        try (ByteArrayInputStream bais = new ByteArrayInputStream(buf)) {
            boolean isMarkSupported = bais.markSupported();

            System.out.println("isMarkSupported: " + isMarkSupported);
            System.out.println("прочитали: " + bais.read());
            System.out.println("прочитали: " + bais.read());

            bais.mark(1);
            System.out.println("прочитали: " + bais.read());
            isMarkSupported = bais.markSupported();
            System.out.println("isMarkSupported: " + isMarkSupported);

            bais.reset();
            isMarkSupported = bais.markSupported();
            System.out.println("isMarkSupported: " + isMarkSupported);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
