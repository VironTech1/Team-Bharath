public class p6 {
    /*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */
    public static void main(String args[])
    {
        int i,j,k=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k);
                k=k+1;
            }
            System.out.println();
        }

    }
}
