package lessons26;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args)  {

        try ( DataOutputStream dataOutputStream =
                      new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data")));)
        {
            dataOutputStream.writeInt(10);

        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
