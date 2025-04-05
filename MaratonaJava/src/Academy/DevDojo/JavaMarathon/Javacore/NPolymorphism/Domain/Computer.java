package Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain;

public class Computer extends Product{
    public static final double TAX = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxProduct() {
        System.out.println("Calculating Computer Tax");
        return this.price * TAX;
    }
}
