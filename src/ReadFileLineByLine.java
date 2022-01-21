import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        var fileName = "8.txt";
        parseFile(fileName);
    }

    private static void parseFile(String fileName) {
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            printResult(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printResult(Stream<String> lines) {
        var lineNumber = new AtomicInteger(0);
        lines.filter(byCondition())
                .map(l -> lineNumber.incrementAndGet() + " " + l)
                .forEach(System.out::println);
    }

    private static Predicate<String> byCondition() {
        return l -> l.contains("п")
                && l.contains("о")
                && l.contains("р")
                && l.contains("ш")
                && l.contains("а");
    }
}
