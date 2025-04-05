package Academy.DevDojo.JavaMarathon.Javacore.FModifierStatic.Test;

import Academy.DevDojo.JavaMarathon.Javacore.FModifierStatic.Domain.Car;

public class CarTest01 {
    public static void main(String[] args) {


        Car car01 = new Car("BMW", 275);
        Car car02 = new Car("Mercedes", 280);
        Car car03 = new Car("BMW", 295);

        Car.setLimitSpeed(180);

        car01.print();
        car02.print();
        car03.print();
    }
}
