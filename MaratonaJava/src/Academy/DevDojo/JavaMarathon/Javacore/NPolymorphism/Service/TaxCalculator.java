package Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Service;

import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.Computer;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.Product;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain.Tomato;

public class TaxCalculator {
    public static void calculateTax(Product product) {
        System.out.println("Product tax report");
        double tax = product.calculateTaxProduct();
        System.out.println("Product name: " + product.getName());
        System.out.println("Product price: " + product.getPrice());
        System.out.println("Product tax: " + tax);
        if (product instanceof Tomato) {
            String expiration = ((Tomato) product).getExpiration();
            System.out.println("Product expiration: " + expiration);
        }
    }
}
