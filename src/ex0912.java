public class ex0912 {

    public static void main(String[] args) throws NumberFormatException {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }

        //напишите тут ваш код
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException has been caught.");
        }
    }

}