package lessons30;

import java.io.File;
import java.nio.file.Path;

public class Example1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/song");
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.getParentFile());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());
        System.out.println("*".repeat(20));
        Path path = Path.of("src/main/resources/song");
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getNameCount());
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.toAbsolutePath());

    }
}
