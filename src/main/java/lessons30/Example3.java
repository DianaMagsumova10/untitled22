package lessons30;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) throws IOException {
        Path pathCopySong = Path.of("src/main/resources/song-copy");
        Path song = Path.of("src/main/resources/song");
//        Files.copy(song, pathCopySong);
        System.out.println(Files.size(Path.of("src/main/resources/song")));
        System.out.println(pathCopySong.getFileName());
        System.out.println(song.getRoot());
        System.out.println(song.startsWith("Lalalal"));
        System.out.println(song.endsWith("Lalalal"));
//
//        List<String> strings = Files.readAllLines(Path.of("src/main/resources/song"), StandardCharsets.UTF_8);
//        for (String string : strings) {
//            System.out.println(string);
//        }

        Stream<String> lines = Files.lines(Path.of("src/main/resources/song"));
        List<String> result = lines.filter(line -> line.startsWith("Принеси")).map(String::toUpperCase).collect(Collectors.toList());
        result.forEach(System.out::println);


    }
}
