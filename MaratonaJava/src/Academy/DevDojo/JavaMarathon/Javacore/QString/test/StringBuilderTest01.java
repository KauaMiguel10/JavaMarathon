package Academy.DevDojo.JavaMarathon.Javacore.QString.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String name = "William Suane";
        name.concat(" Dev Dojo");
        name = name.substring(0,3);
        System.out.println(name);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" Dev Dojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
