package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Test;

import Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int num1 = 1;
        int num2 = 2;

        calc.changesTwoNumbers(num1, num2);

        System.out.println(num1);
        System.out.println(num2);



    }
}
