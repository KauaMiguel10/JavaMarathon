package Academy.DevDojo.JavaMarathon.Javacore.OException.exception.test;

import Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDb = "Goku";
        String passwordDb = "ssj";
        System.out.println("Please enter your username: ");
        String usernameScanner = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String passwordScanner = scanner.nextLine();
        if(!usernameDb.equals(usernameScanner) || !passwordDb.equals(passwordScanner)){
            throw new LoginInvalidException("Username or password invalid");
        }

        System.out.println("Login successful");
    }

}
