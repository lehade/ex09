import java.util.ArrayList;

public class ex0910 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try
        {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }

        catch (IndexOutOfBoundsException e)
        {
            System.out.println("IndexOutOfBoundsException has been caught.");
        }
    }

}