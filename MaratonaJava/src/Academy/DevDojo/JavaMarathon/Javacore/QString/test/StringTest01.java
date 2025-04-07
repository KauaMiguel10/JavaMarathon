package Academy.DevDojo.JavaMarathon.Javacore.QString.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name ="William";
        String name2 ="William";
        name = name.concat(" Suane");
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("William");
        System.out.println(name2 == name3.intern());
    }
}
