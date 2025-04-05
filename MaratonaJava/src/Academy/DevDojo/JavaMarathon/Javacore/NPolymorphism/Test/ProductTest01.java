package Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Test;

import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.Computer;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.TV;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.Tomato;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("Tomato", 10);
        TV tv = new TV("Samsung 50\" ", 5000);

        TaxCalculator.calculateTax(computer);
        System.out.println("-----------------------------");
        TaxCalculator.calculateTax(tomato);
        System.out.println("-----------------------------");
        TaxCalculator.calculateTax(tv);
    }
}
