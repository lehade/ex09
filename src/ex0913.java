import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class ex0913 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        }

        catch (NullPointerException e)
        {
            System.out.println("Reference is null. Exception has been caught.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException. Exception has been caught.");
        }
/*        catch (Exception e)
        {
            System.out.println("Any other errors. Exception has been caught.");
        }*/

        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }

}