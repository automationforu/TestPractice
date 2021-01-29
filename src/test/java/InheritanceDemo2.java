public class InheritanceDemo2 extends InheritanceDemo {
    public void y(){
        System.out.println("It is a child class");
    }
    public static void main(String[] args) {
        InheritanceDemo2 d1=new InheritanceDemo2();
        d1.x();
        d1.y();
        d1.name="manoj";
        d1.age=24;
        System.out.println(d1.name);
        System.out.println(d1.age);
    }
}
