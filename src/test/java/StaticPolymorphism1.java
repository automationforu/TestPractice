public class StaticPolymorphism1 {
    void dojob(){
        System.out.println("1");
    }
    void dojob(String s){
        System.out.println(s);
    }
    void dojob(int i){
        System.out.println(i);
    }
    void dojob(Float f){
        System.out.println(f);
    }

    public static void main(String[] args) {
        StaticPolymorphism1 s=new StaticPolymorphism1();
        s.dojob(20);
    }
}
