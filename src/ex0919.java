public class ex0919 {

    public static void main(String[] args) {

        try {
            divisionByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divisionByZero() {
        System.out.println(10/0);
    }

}