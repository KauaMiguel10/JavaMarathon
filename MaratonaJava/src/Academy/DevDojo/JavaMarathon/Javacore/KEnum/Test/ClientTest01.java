package Academy.DevDojo.JavaMarathon.Javacore.KEnum.Test;

import Academy.DevDojo.JavaMarathon.Javacore.KEnum.Domain.Client;
import Academy.DevDojo.JavaMarathon.Javacore.KEnum.Domain.TypeClient;
import Academy.DevDojo.JavaMarathon.Javacore.KEnum.Domain.TypePay;

public class ClientTest01 {
    public static void main(String[] args) {

        Client client01 = new Client("Tsubasa", TypeClient.INDIVIDUAL, TypePay.CREDIT);
        Client client02 = new Client("Tsubasa", TypeClient.CORPORATION, TypePay.DEBIT);

        System.out.println(client01);
        System.out.println(client02);

        System.out.println("--------------------------------------------------");

        System.out.println(TypePay.DEBIT.calculateDiscount(100));
        System.out.println(TypePay.CREDIT.calculateDiscount(100));


    }
}
