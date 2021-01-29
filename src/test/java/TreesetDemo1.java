import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo1 {
    public static void main(String[] args) {
        Set<String> s=new TreeSet<String>();
        s.add("ravi");
        s.add("Anil");
        s.add("Amar");
        s.add("Hari");
        s.add("Manoj");

        for (String a:s) {
            System.out.println(a);

        }
    }
}
