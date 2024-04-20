package lessons25;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) {
        File file = new File("src/main/resources/song");
        try (FileReader fileReader = new FileReader(file)) {
            int symbol;
            while ((symbol = fileReader.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
