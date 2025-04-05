package Academy.DevDojo.JavaMarathon.Javacore.GAssociation.Test;

import java.util.Scanner;

public class KeyboardReading {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = input.nextLine();
        System.out.println("Enter your age ");
        int age = input.nextInt();
        System.out.println("Type M or F for your gender");
        char gender = input.next().charAt(0);
        System.out.println("-----------------------------");
        System.out.println("Name : " + name + "\nAge : " + age + "\nGender : " + gender);
    }
}
