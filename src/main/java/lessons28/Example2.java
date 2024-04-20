package lessons28;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputByte = new ByteArrayOutputStream(120);

        String value = "JavaRush";
        outputByte.write(value.getBytes());
        byte[] result = outputByte.toByteArray();
        System.out.println("Вывод до сброса: ");

        for (byte b : result) {
            // Вывод символов
            System.out.print((char) b);
        }

        outputByte.reset();

        byte[] resultAfterReset = outputByte.toByteArray();
        System.out.println("\nВывод содержимого после сброса:");

        for (byte b : resultAfterReset) {
            // Вывод символов
            System.out.print((char) b);
        }
    }
}
