public class ex0908 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {

            String s = null;
            String m = s.toLowerCase();
        }

        catch (NullPointerException e)
        {
            System.out.println("NullPointerException has been caught.");
        }

    }

}