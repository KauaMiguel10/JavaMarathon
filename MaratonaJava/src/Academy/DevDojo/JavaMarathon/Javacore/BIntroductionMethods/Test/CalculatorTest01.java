package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Test;

import Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.sumTwoNumbers();
        System.out.println("-----------------");
        calc.subtractTwoNumbers();
    }
}
