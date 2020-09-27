import java.util.HashMap;

public class CountingCharacterHashMap {

    public static void main(String[] args) {
        String countThese = "abchadafhnajkfnakjfa";
        HashMap<Character, Integer> map = new HashMap<>();

        char array[] = countThese.toLowerCase().toCharArray();

        for (char c : array) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }


}

