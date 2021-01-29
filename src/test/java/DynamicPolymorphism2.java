public class DynamicPolymorphism2 extends DynamicPolymorphism1 {

    void x(){
        System.out.println("B");
    }

    public static void main(String[] args) {
       // DynamicPolymorphism2 d=new DynamicPolymorphism1();
        DynamicPolymorphism1 e=new DynamicPolymorphism2();
        DynamicPolymorphism1 f=new DynamicPolymorphism1();
        DynamicPolymorphism2 g=new DynamicPolymorphism2();
      //  d.x();
        e.x();
        f.x();
        g.x();

    }
}
