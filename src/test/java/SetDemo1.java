import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> s=new HashSet<String>();
        s.add("Ravi");
        s.add("Rambo");
        s.add("Ravi");
        s.add("ravi");

        for (String a:s) {
            System.out.println(a);

        }
    }
}
