package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Test;

import Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int[] numbers = {1,2,3,4,5};

        calc.sumArray(numbers);
        calc.sumVarArgs(1,2,3,4,5,6,7);


    }
}
