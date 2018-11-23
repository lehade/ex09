import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isLetter;

public class ex0923 {

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().replaceAll("\\s+", "").toCharArray();

        List<Character> textVowels = new ArrayList<>();
        List<Character> other = new ArrayList<>();

        for (char c : input) {
            if (isVowel(c)) {
                textVowels.add(c);
            } else {
                other.add(c);
            }
        }

        for (Character textVowel : textVowels) {
            System.out.print(textVowel + " ");
        }
        System.out.println();
        for (Character character : other) {
            System.out.print(character + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }

}