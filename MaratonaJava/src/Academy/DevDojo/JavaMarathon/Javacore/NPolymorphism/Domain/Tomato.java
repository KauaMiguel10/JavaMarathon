package Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Domain;

public class Tomato extends Product{

    public static final double TAX = 0.06;

    private String expiration;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxProduct() {
        System.out.println("Calculating Tomato Tax");
        return this.price * TAX;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}
