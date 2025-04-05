package Academy.DevDojo.JavaMarathon.Introduction;

public class Class05ConditionalStructures06 {
    public static void main(String[] args) {

        byte day = 3;

        switch (day){
            case 2,3,4,5,6:
                System.out.println("business day");
                break;
            case 1,7:
                System.out.println("It's not a business day");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
