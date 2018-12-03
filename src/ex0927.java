import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ex0927 {

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Tima", new Cat("Tima"));
        cats.put("Anti", new Cat("Anti"));
        cats.put("Dimi", new Cat("Dimi"));
        cats.put("Timie", new Cat("Timie"));
        cats.put("Lo", new Cat("Lo"));
        cats.put("Andi", new Cat("Andi"));
        cats.put("Lahi", new Cat("Lahi"));
        cats.put("Domh", new Cat("Domh"));
        cats.put("More", new Cat("More"));
        cats.put("Alea", new Cat("Alea"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet hashSet = new HashSet(map.values());
        return hashSet;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }

}