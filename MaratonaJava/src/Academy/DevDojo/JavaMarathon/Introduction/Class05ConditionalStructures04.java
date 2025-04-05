package Academy.DevDojo.JavaMarathon.Introduction;

public class Class05ConditionalStructures04 {
    public static void main(String[] args) {

        double salaryAnnual = 25000;
        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;
        double taxValue;

        if (salaryAnnual <= 34712){
            taxValue = salaryAnnual * firstTrack;
        } else if (salaryAnnual <= 68.507) {
            taxValue = salaryAnnual * secondTrack;
        }else{
            taxValue = salaryAnnual * thirdTrack;
        }
        System.out.println(taxValue);
    }
}
