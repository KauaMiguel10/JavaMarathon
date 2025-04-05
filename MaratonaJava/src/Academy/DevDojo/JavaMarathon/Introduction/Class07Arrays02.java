package Academy.DevDojo.JavaMarathon.Introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {

        //byte, short, int, long, float, double 0
        // chat '\u0000'
        // boolean false
        // String null

        String[] names = new String[4];

        names[0] = "Goku";
        names[1] = "Kurosaki";
        names[2] = "Luffy";
        names[3] = "Naruto";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        names = new String[5];


    }
}
