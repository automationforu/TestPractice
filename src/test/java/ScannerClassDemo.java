import java.util.Scanner;

public class ScannerClassDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number :");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        System.out.println("Enter any Name :");
        String c=sc.next();
        System.out.println(" a value is :"+a);
        System.out.println(" b value is :"+b);
        System.out.println(" c name is :"+c);
    }
}
