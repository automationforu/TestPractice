public class ArmstrongNumber {
    public static void main(String[] args) {
        int d=0,a,t;
        int n=153;
        t=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            d=d+(a*a*a);
        }
        if(t==d)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
