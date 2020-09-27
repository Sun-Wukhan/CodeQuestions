import java.util.HashSet;
import java.util.Set;

public class CountingLoops {

    public static void main(String[] args) {

        Set<Integer> counting = new HashSet<>(); 

        String another = "hadaajdajfajfaahjsbdfbjsafsa";
        int count = 0;

        for (int i = 0; i < another.length(); i++) {
            if (another.charAt(i) == 'a')
                count++;
        }
        System.out.println(count);
    }
}

