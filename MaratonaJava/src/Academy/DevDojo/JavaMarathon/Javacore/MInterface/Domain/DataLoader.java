package Academy.DevDojo.JavaMarathon.Javacore.MInterface.Domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    public default void checkPermission(){
        System.out.println("doing permission check");
    };

    public static void retrieverMaxDataSize(){
        System.out.println("Within MaxDataSize");
    }
}
