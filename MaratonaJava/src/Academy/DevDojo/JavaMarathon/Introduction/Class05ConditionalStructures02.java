package Academy.DevDojo.JavaMarathon.Introduction;

public class Class05ConditionalStructures02 {
    public static void main(String[] args) {

        // age < 15 category children
        // age >= 15 && idade < 18 category juvenile
        // age >= 18 category adult

        int age = 18;

        if (age < 15){
            System.out.println("Category children");
        } else if (age >= 15 && age < 18) {
            System.out.println("category juvenile");
        }else {
            System.out.println("category adult");
        }
    }
}
