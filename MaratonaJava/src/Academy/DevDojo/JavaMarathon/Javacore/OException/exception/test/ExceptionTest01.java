package Academy.DevDojo.JavaMarathon.Javacore.OException.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

        createNewFile();
    }

    private static void createNewFile() {
        File file = new File("file\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File Created " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
