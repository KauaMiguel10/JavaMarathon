package Academy.DevDojo.JavaMarathon.Introduction;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {

        int[][] day = new int[3][3];
        day[0][0] = 31;
        day[0][1] = 38;
        day[0][2] = 31;

        day[1][0] = 31;
        day[1][1] = 38;
        day[1][2] = 31;

        for (int i = 0; i < day.length; i++) {
            for (int j = 0; j < day[i].length; j++) {
                System.out.println(day[i][j]);
            }
        }

        System.out.println("-----------------------------------------------");

        for (int[] arrBase: day){
            for (int num: arrBase){
                System.out.println(num);
            }
        }

    }

}
