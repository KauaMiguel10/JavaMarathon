package Academy.DevDojo.JavaMarathon.Javacore.MInterface.Domain;

public class DatabaseLoader implements DataLoader, DataRemove {

    // private -> default -> protected -> public

    @Override
    public void load() {
        System.out.println("Loading Database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission for Database...");
    }

    public static void retrieverMaxDataSize(){
        System.out.println("Within MaxDataSize for Database...");
    }
}
