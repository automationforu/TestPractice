import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap();
        hm.put(111,"pass");
        hm.put(112,"fail");
        hm.put(113,"fail");
        hm.put(null,"fail");

        Set<Integer> keys=hm.keySet();

        for (Integer key:keys) {
            System.out.println(hm.get(key));

        }
    }
}
