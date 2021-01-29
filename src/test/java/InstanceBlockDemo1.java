public class InstanceBlockDemo1 {
    {
        System.out.println("welcome aboard");
    }
    {
        System.out.println("have a safe journey");
    }

    public static void main(String[] args) {
        System.out.println("a b c d");
        InstanceBlockDemo1 i1=new InstanceBlockDemo1();
        InstanceBlockDemo1 i2=new InstanceBlockDemo1();
    }
}
