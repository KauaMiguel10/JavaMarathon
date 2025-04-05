package Academy.DevDojo.JavaMarathon.Javacore.HExtends.Domain;

public class Person {
    protected String name;
    protected int age;
    protected Address address;

    static{
        System.out.println("Inside static block Person");
    }
    {
        System.out.println("Inside the non-static block Person 1");
    }
    {
        System.out.println("Inside the non-static block Person  2");
    }

    public Person(String name) {
        System.out.println("Person constructor");
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address.getName() + " " + this.address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
