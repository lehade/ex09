public class ex0907 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try
        {
            int a = 42 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException has been caught.");
        }

    }

}