package Academy.DevDojo.JavaMarathon.Introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {

        int[] number01 = new int[3];
        int[] number02 = {1,2,3,4,5};
        int[] number03 = new int[]{5,4,3,2,1};

        for (int i = 0; i < number03.length; i++) {
            System.out.println(number03[i]);
        }

        System.out.println("----------------------------------------");

        for(int num : number02){
            System.out.println(num);
        }
    }
}
