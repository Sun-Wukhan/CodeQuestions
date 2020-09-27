public class ReverseInteger {

    public static void main(String[] args) {
        long front = 54321;
        long reverse = 0;

        while(front != 0) {
            reverse = reverse * 10 + front % 10;
            front = front/10;
        }
        System.out.println(reverse);
        System.out.println(reverseNumber(98765));
    }

    public static StringBuffer reverseNumber(int num) {
        return new StringBuffer(String.valueOf(num)).reverse();
    }
}
