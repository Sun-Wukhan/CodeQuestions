public class ReverseString {

    public static void main(String[] args) {
        String word = "Shayna";
        String newWord = "";

        for(int i = word.length()-1; i>=0; i--) {
            newWord = newWord + word.charAt(i);
        }

        System.out.println(newWord);
        System.out.println(reverseWord("This"));
    }

    public static String reverseWord(String changeThis){
        String newTime = "";

        for(int i=changeThis.length()-1; i>=0; i--) {
            newTime = newTime + changeThis.charAt(i);
        }

        return newTime;

    }
}
