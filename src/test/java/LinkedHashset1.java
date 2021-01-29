import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset1 {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<String>();
        s.add("z");
        s.add("a");
        s.add("govinda");
        s.add("hurricane");

        for (String a:s) {
            System.out.println(a);

        }
    }
}
