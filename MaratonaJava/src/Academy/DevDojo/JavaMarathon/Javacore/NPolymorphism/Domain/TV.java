package Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain;

public class TV extends Product{
    public static final double TAX = 0.21;
    public TV(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxProduct() {
        System.out.println("Calculating Tv Tax");
        return this.price * TAX;
    }
}
