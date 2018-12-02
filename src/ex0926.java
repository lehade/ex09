import java.util.ArrayList;

public class ex0926 {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {2, 3, 4 ,5, 6});
        list.add(new int[] {5, 6});
        list.add(new int[] {3, 4 ,5, 6});
        list.add(new int[] {2, 3, 4 ,5, 6, 7, 8});
        list.add(new int[0]);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }

}