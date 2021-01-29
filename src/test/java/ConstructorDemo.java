import javax.imageio.stream.ImageInputStream;

public class ConstructorDemo {
    String name;
    String location;
    String Mobile;
    String MailID;

    public ConstructorDemo(String n,String l,String m,String ma){
        name=n;
        location=l;
        Mobile=m;
        MailID=ma;
        System.out.println(name);
        System.out.println(location);
        System.out.println(Mobile);
        System.out.println(MailID);
    }

    public static void main(String[] args) {
        ConstructorDemo c1=new ConstructorDemo("manoj","Bangalore","9581441090","manojkumarreddy235@gmail.com");
        ConstructorDemo c2=new ConstructorDemo("chandu","Atmakur","7075157264","chanduk@gmail.com");
        System.out.println(c1);
        System.out.println(c2);

        String S1=new String("Android");
        System.out.println(S1);
        String S2=new String("Android");

        String s=S1+" Mobile";
        System.out.println(s);
        String x="Android";
        String y="Android";
        System.out.println(x==y);
        System.out.println(S1==S2);
        System.out.println(x==S1);
        char c=S1.charAt(2);
        System.out.println(c);
    }
}
