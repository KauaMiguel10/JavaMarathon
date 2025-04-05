package Academy.DevDojo.JavaMarathon.Introduction;

public class Class05ConditionalStructures03 {
    public static void main(String[] args) {

        double salary = 3000;
        String messageDonate = "I will donate 500 dollars";
        String messageNotDonate = "I will not donate 500 dollars";
        String result = salary > 5000 ? messageDonate : messageNotDonate;

        System.out.println(result);

    }
}
