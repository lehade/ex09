import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex0921 {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                try {

                        while (true) {
                            list.add(Integer.parseInt(reader.readLine()));
                        }

                    }
                    catch(NumberFormatException e){


                        for (Integer value : list) System.out.println(value);

                    }
                }
        catch (Exception e) {

        }

    }

}