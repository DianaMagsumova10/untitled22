package lessons26;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        byte[] bytes = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(458);
        baos.write(458);
        baos.write(458);
        baos.write(458);
        bytes = baos.toByteArray();
        System.out.println(Arrays.toString(bytes));


        byte [] array  = ("new DataOutputStream(new BufferedOutputStream(new " +
                "FileOutputStream(").getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        while (byteArrayInputStream.available() > 0){
            byte x = (byte) byteArrayInputStream.read();
            System.out.print(Integer.toBinaryString(x));
        }
    }
}
