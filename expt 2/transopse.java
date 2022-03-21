import java.util.*;
class transpose
{
    public static void main(String args[])
    {
        Scanner abc=new Scanner(System.in); 
        int r,c,i,j;
        int a[][]=int[100][100];
        int t[][]=int[100][100];
        System.out.println("Enter the number of rows : ");
        r=abc.nextInt();
        System.out.println("Enter the number of columns : ");
        c=abc.nextInt();
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=abc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.println(a[j][i]);
            }
        }

    }
}