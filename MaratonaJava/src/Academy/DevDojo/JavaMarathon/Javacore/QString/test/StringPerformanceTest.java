package Academy.DevDojo.JavaMarathon.Javacore.QString.test;

public class StringPerformanceTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        concatString(100_000);
        long end = System.currentTimeMillis();
        System.out.println("Time Spent: " + (end - start) + "ms");

        System.out.println("--------------------------------");

        start = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time Spent: " + (end - start) + "ms");

        System.out.println("--------------------------------");

        start = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time Spent: " + (end - start) + "ms");


    }



    private static void concatString(int size) {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i; // 0,01,012,013
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}
