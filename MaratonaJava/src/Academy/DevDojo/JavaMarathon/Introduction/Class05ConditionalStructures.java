package Academy.DevDojo.JavaMarathon.Introduction;

public class Class05ConditionalStructures {
    public static void main(String[] args) {

        int age = 15;
        boolean notAuthorizedToBuyDrinks = age >= 18;

        if (notAuthorizedToBuyDrinks){
            System.out.println("Authorized to buy drinks");
        }else{
            System.out.println("Not authorized to buy drinks");
        }


    }
}
