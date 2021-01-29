import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListA2 {
    public static void main(String[] args) {
        List l=new LinkedList();
        l.add("core java");
        l.add("threads");
        l.add("ayodhya");

        for (Object obj:l) {
            System.out.println(obj);

        }

//        Iterator itr =l.iterator();
//        while (itr.hasNext()){
//            Object obj =itr.next();
//            System.out.println(obj);
//        }
    }
}
