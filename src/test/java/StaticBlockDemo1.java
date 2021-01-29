public class StaticBlockDemo1 {
    static {
        System.out.println("Welcome");
    }
    static {
        System.out.println("world");
    }
    static {
        System.out.println("Good Morning");
    }

    public static void main(String[] args) {
        System.out.println("B");
    }
}
