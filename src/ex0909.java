public class ex0909 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException has been caught.");
        }

    }

}