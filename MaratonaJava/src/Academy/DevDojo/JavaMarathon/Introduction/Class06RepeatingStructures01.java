package Academy.DevDojo.JavaMarathon.Introduction;

public class Class06RepeatingStructures01 {
    public static void main(String[] args) {

        //while, do while, for

        int count = 12;

        while (count < 10) {
            System.out.println(++count);
        }
        do {
            System.out.println("Dentro do do-while");
        } while (count < 10);

        System.out.println("-----------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
