

public class StaticMethodsDemo1 {
    static int i;
    static int j;
    static void x()
    {
        System.out.println("Hii");
    }
    static void y(){
        System.out.println("Byee");
    }

    public static void main(String[] args) {
        StaticMethodsDemo1.i=20;
        StaticMethodsDemo1.x();
        System.out.println(StaticMethodsDemo1.i);
        StaticMethodsDemo1 s=new StaticMethodsDemo1();
        s.j=30;
        s.y();
        System.out.println(s.j);
    }
}
