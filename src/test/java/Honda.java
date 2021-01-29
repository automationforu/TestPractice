public class Honda extends Bike{
    void run(){
        System.out.println("Running smoothly");
    }

    public static void main(String[] args) {
       Bike B=new Honda();
       B.run();
    }
}
