package Academy.DevDojo.JavaMarathon.Javacore.MInterface.Domain;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Loading file...");
    }

    @Override
    public void remove() {
        System.out.println("Removing file...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission for file...");
    }
}
