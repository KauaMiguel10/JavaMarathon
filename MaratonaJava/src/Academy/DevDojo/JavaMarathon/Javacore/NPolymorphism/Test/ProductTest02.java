package Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Test;

import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.Computer;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.Product;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.Tomato;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Service.TaxCalculator;

public class ProductTest02 {
    public static void main(String[] args) {

        Product product = new Computer("Ryzen 9", 3000);
        Tomato tomato = new Tomato("Tomato", 10);
        tomato.setExpiration("29/03/2025");
        TaxCalculator.calculateTax(tomato);
        System.out.println("-----------------------");
        TaxCalculator.calculateTax(product);

    }
}
