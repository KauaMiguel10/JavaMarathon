package Academy.DevDojo.JavaMarathon.Javacore.AIntroductionClass.Test;

import Academy.DevDojo.JavaMarathon.Javacore.AIntroductionClass.Domain.Car;

public class CarTest01 {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Mustang";
        car1.model = "GT";
        car1.year = 2018;

        car2.name = "Tesla";
        car2.model = "3";
        car2.year = 2024;

        System.out.println("Name: " + car1.name + " Model : " + car1.model + " Year: " + car1.year);
        System.out.println("Name: " + car2.name + " Model : " + car2.model + " Year: " + car2.year);
    }
}
