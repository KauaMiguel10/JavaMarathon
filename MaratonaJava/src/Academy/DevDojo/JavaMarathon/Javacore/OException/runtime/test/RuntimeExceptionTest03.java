package Academy.DevDojo.JavaMarathon.Javacore.OException.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        extracted();
        System.out.println("-----------------------");
        extracted2();

    }

    private static String extracted() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing file");
            return "open connection";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("closing file");
        }
        return null;
    }

    private static void extracted2() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing file");
            throw new RuntimeException();
        } finally {
            System.out.println("closing file");
        }

    }
}
