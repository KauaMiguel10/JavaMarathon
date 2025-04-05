package Academy.DevDojo.JavaMarathon.Javacore.JFinalModifier.Test;

import Academy.DevDojo.JavaMarathon.Javacore.JFinalModifier.Domain.Buyer;
import Academy.DevDojo.JavaMarathon.Javacore.JFinalModifier.Domain.Car;
import Academy.DevDojo.JavaMarathon.Javacore.JFinalModifier.Domain.Ferrari;

public class CarTes01 {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.LIMIT_SPEED);
        System.out.println(car.buyer);
        car.buyer.setName("Kuririn");
        System.out.println(car.buyer);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}
