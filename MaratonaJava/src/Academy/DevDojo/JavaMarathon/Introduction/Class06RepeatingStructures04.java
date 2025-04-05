package Academy.DevDojo.JavaMarathon.Introduction;

public class Class06RepeatingStructures04 {
    public static void main(String[] args) {

        double valueCar = 30000;

        for (int installment = 1; installment <= valueCar; installment++) {
            double installmentValue = valueCar / installment;
            if (installmentValue < 1000) {
                break;
            }
            if (installmentValue >= 1000) {
                System.out.println("payment installment " + installment + " = " + installmentValue);
            }

        }


    }
}
