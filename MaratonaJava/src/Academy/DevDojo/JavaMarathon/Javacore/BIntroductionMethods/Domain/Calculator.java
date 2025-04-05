package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double DivideTwoNumbers(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void printDivideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("there is no division by 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changesTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Inside the change 2 numbers");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

}
