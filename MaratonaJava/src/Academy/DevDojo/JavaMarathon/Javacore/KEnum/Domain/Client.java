package Academy.DevDojo.JavaMarathon.Javacore.KEnum.Domain;

public class Client {

    private String name;
    private TypeClient typeClient;
    private TypePay typePay;

    public Client(String name, TypeClient typeClient, TypePay typePay) {
        this.name = name;
        this.typeClient = typeClient;
        this.typePay = typePay;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient +
                ", typeClientInt=" + typeClient.VALUE +
                ", typePay=" + typePay +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeClient getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }
}
