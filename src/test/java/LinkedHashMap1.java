import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> lhm = new LinkedHashMap();
        lhm.put(111,"Abcd");
        lhm.put(112,"ABcd");
        lhm.put(113,"Abcd");
        lhm.put(null,"");
        Set<Integer> a=lhm.keySet();

        for (int key:a) {
            System.out.println(lhm.get(key));

        }
    }
}
