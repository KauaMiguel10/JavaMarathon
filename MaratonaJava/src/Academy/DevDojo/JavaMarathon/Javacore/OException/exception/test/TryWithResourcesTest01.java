package Academy.DevDojo.JavaMarathon.Javacore.OException.exception.test;

import Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain.Read1;
import Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain.Read2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Read1 read1 = new Read1();
             Read2 read2 = new Read2()) {
        } catch (IOException e) {
        }
    }

    public static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }
    }
}
