class ArrayClass2
{

    public static void main(String[] args)
    {
        int A1[]={1,2,3,4,5,6};
        int A2[]={2,4,6,7};
        System.out.println("The length of Array 1 is :"+A1.length);
        System.out.println("The length of Array 2 is :"+A2.length);

        for (int i=0;i<A1.length;i++)
        {
            for (int j=0;j<A2.length;j++)
            {
                if(A1[i]==A2[j])

                {
                    System.out.print(" "+A1[i]);
                    System.out.println(" ");
                }
            }
        }
    }
}

