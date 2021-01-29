import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> tm=new TreeMap();
        tm.put(111,"manoj");
        tm.put(112,"hari");
        tm.put(110,"amar");
        tm.put(100,"machan");

        Set<Integer> a=tm.keySet();

        for (Integer key:a) {
            System.out.println(tm.get(key));

        }
    }
}
