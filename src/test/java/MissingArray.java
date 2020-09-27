import java.util.Collections;

public class MissingArray {

    public static void main(String[] args) {
        int storm[] = {1, 2, 3, 4, 5, 6, 7, 9, };
        int sum = 0;
        int sum2 = 0;

        for(int i = 0; i<storm.length; i++) {
            sum = sum + storm[i];
        }
        System.out.println(sum);

        for(int i =0; i <=10; i++) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);
        System.out.println(sum2-sum);

    }
}
