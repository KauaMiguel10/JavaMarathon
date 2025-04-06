package Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Read2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing read 2");
    }
}
