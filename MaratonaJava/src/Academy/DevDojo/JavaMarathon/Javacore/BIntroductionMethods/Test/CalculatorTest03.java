package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Test;

import Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        double result = calc.DivideTwoNumbers(20,2);
        System.out.println(result);
        System.out.println("----------------------------");
        calc.printDivideTwoNumbers(20,0);
    }
}
