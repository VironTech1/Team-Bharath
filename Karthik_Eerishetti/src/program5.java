public class program5 {
    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(j=1;j<=4;j++){
            for(k=4;k>=j;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
