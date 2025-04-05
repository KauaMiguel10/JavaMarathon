package Academy.DevDojo.JavaMarathon.Introduction;

public class Class06RepeatingStructures02 {
    public static void main(String[] args) {

        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
