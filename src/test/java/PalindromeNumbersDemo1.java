public class PalindromeNumbersDemo1 {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=323;

        temp=n;
        System.out.println(n);
        while (n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp == sum) {
            System.out.println("323 is a palindrome number");
        } else {
            System.out.println("323 is not a palindrome number");
        }

    }
}
