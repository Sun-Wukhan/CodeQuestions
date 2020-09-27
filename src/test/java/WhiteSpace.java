import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class WhiteSpace {

    public static void main(String[] args) {
        String str = "Ali Abrar Khan";
        String str2 = "abcabcabcs";

        Set<Character> adder = new LinkedHashSet<>();

        for(int i = 0; i<str2.length(); i++) {
            adder.add(str2.charAt(i));
        }
        System.out.println(adder);

        String newWord = str.replaceAll(" ", "").toLowerCase();
        System.out.println(newWord);

        Set<Character> unique = new LinkedHashSet<>();
        for (int i = 0; i < newWord.length(); i++) {
            unique.add(newWord.charAt(i));
        }
        System.out.println(unique);
    }


}

