package Academy.DevDojo.JavaMarathon.Javacore.OException.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
      /*  try{
            division(10,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }  */
        division(10,0);
        System.out.println("Division completed!");

    }

    /**
     *
     * @param a
     * @param b division does not accept 0
     * @return
     * @throws IllegalArgumentException b == 0
     */


    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
       return a / b;
    }
}
