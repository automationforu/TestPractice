import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> ht=new Hashtable();
        ht.put(111,"machan");
        ht.put(112,"amar");
        ht.put(100,"hari");

        Set<Integer> a=ht.keySet();

        for (Integer key:a) {
            System.out.println(ht.get(key));
        }
    }
}
