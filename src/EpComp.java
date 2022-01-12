import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EpComp {

    public static class ReadFileLineByLine {
        public static void main(String[] args) {
            try {
                int i = 0;
                File file = new File("8.txt");

                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                         if (line.contains("п") & line.contains("о") & line.contains("р") & line.contains("ш") & line.contains("а")) {
                    //   if (line.contains("п") & line.contains("ш") & line.contains("р") & line.contains("а") ) {
                        i++;
                        System.out.println(i + " " + line);
                    }
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
