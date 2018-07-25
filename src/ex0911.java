import java.util.HashMap;

public class ex0911 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {


            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }

        //напишите тут ваш код
        catch (NullPointerException e) {

            System.out.println("NullPointerException has been caught.");
        }
    }


}