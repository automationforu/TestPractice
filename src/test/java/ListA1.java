import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListA1 {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("core java");
        l.add("threads");
        l.add("jdbc");
        l.add("xxx");

        Iterator itr=l.iterator();
        while(itr.hasNext()){
            Object obj=itr.next();
            System.out.println(obj);
        }
    }
}
