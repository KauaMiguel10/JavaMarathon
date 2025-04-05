package Academy.DevDojo.JavaMarathon.Introduction;

public class Class06RepeatingStructures05 {
    public static void main(String[] args) {

        double valueCar = 30000;

        for (int installment = (int) valueCar; installment >= 1; installment--) {
            double installmentValue = valueCar / installment;
            if (installmentValue < 1000) {
                continue;
            }
            System.out.println("payment installment " + installment + " = " + installmentValue);

        }


    }
}
