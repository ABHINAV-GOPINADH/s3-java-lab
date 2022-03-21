import java.util.*;
class multimatrix
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int r1,c1,r2,c2,i,j,sum=0,k;
        int a[][]=new int[100][100];
        int b[][]=new int[100][100];
        int R[][]=new int[100][100];
        System.out.println("Enter the number of rows in a matrix 1 : ");
        r1=obj.nextInt();
        System.out.println("Enter the number of columns in a matrix 1  : ");
        c1=obj.nextInt();
        System.out.println("Enter the number of rows in a matrix 2 : ");
        r2=obj.nextInt();
        System.out.println("Enter the number of columns in a matrix 2  : ");
        c2=obj.nextInt();
        System.out.println("Matrix 1 : ");
        if(c1==r2)
        {
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    a[i][j]=obj.nextInt();
                }
            }
            System.out.println("Matrix 2 : ");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    b[i][j]=obj.nextInt();
                }
            }
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    for(k=0;k<c1;k++)
                    {
                        sum=sum+a[i][k]*b[k][j];   
                    }    
                 R[i][j]=sum;   
                }
            }
        }
        System.out.println("Result is : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.println(R[i][j]);
            }
        }

    }
}