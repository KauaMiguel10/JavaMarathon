package Academy.DevDojo.JavaMarathon.Introduction;

public class Class04Operators {
    public static void main(String[] args) {

        // + - / *

        int number01 = 10;
        int number02 = 20;

        double result = number01 / (double) number02;
        System.out.println(result);

        // %
        int rest = 21 % 7;
        System.out.println(rest);

        // < > <= >= == !=

        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenDiferrentTen = 10 != 10;

        System.out.println(isTenBiggerThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenEqualsTwenty);
        System.out.println(isTenDiferrentTen);

        System.out.println("------------------------------------------------");

        // && (AND) || (OR) !

        int age = 35;
        float salary = 3500F;
        boolean WithinTheLaw = age > 30 && salary > 4612;
        boolean Outlaw = age < 30 && salary >= 3381;

        System.out.println(WithinTheLaw);
        System.out.println(Outlaw);

        System.out.println("------------------------------------------------");

        double totalCurrentAccountValue = 200;
        double totalSavingsAccountValue = 10000;
        float  valuePlaystation5 = 5000f;
        boolean playstationIsBuyable = totalCurrentAccountValue > valuePlaystation5 || totalSavingsAccountValue > valuePlaystation5;

        System.out.println(playstationIsBuyable);

    }
}
