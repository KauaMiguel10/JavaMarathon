package Academy.DevDojo.JavaMarathon.Javacore.MInterface.Test;

import Academy.DevDojo.JavaMarathon.Javacore.MInterface.Domain.DataLoader;
import Academy.DevDojo.JavaMarathon.Javacore.MInterface.Domain.DatabaseLoader;
import Academy.DevDojo.JavaMarathon.Javacore.MInterface.Domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieverMaxDataSize();
        DatabaseLoader.retrieverMaxDataSize();
    }
}
