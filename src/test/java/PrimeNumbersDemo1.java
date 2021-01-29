public class PrimeNumbersDemo1 {
    public static void main(String[] args) {
        int i, a = 0, b = 0;
        int n = 100;
        String primenumbers="";
        for (int j=1;j<=n;j++){

            b=0;
            for (a=j;a>=1;a--)
            {
                if(j%a==0)
                {
                    b=b+1;
                }
            }
            if(b==2)
            {
              primenumbers = primenumbers + j + " ";
            }
        }
        System.out.println(primenumbers);
    }
}

