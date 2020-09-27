import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ListDuplicate {


    public static void main(String[] args) {

        ArrayList<String> arrays = new ArrayList<String>();
        arrays.add("Cow");
        arrays.add("Cow");
        arrays.add("chicken");
        arrays.add("meow meow");
        arrays.add("frog");
        arrays.add("frog");

        System.out.println(arrays);

        LinkedHashSet<String> cool = new LinkedHashSet<String>(arrays);
        System.out.println(cool);

        arrays.clear();
        arrays.addAll(cool);

        System.out.println(arrays);

    }
}
