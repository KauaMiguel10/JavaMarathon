package Academy.DevDojo.JavaMarathon.Javacore.OException.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }

        try {
            exception();
        } catch (Exception e) {
            e = new RuntimeException();
            e.printStackTrace();
        }
    }

    private static void exception() throws SQLException, IOException {

    }
}
